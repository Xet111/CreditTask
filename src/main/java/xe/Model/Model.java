package xe.Model;

import xe.Model.creditfactory.CreditFactory;
import xe.Model.creditfactory.PrepaymentCredit;
import xe.View.databank.AmountOfMoney;
import xe.Model.creditfactory.Credit;
import xe.View.databank.CreditInput;
import xe.View.databank.Term;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {
    ArrayList<Credit> activeCredit = new ArrayList<Credit>();
    ArrayList<Credit> chosenCredit = new ArrayList<Credit>();


    public ArrayList<Credit> getChosenCredit() {
        return chosenCredit;
    }

    public void filterOnAmount(AmountOfMoney amountOfMoney){
        activeCredit.add(new CreditFactory().getCredit(CreditInput.INCREASE_PAYMENT_LINE));
        for(Credit value:activeCredit){
            if(value.getAmount()==amountOfMoney){
                chosenCredit.add(value);
            }
        }
    }
    public void filterOnTerm(Term term){
        for(Credit value:chosenCredit){
            if(value.getTerm()==term && !chosenCredit.contains(value)){
                chosenCredit.add(value);
            }
        }
    }
    @Override
    public String toString() {
        return "Model{" +
                "activeCredit=" + activeCredit +
                ", chosenCredit=" + chosenCredit +
                '}';
    }



}
