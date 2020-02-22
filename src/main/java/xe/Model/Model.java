package xe.Model;

import xe.Model.creditfactory.*;
import xe.View.databank.AmountOfMoney;
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
        for(Credit value:activeCredit){
            if(value.getAmount()==amountOfMoney){
                chosenCredit.add(value);
            }
        }
    }
    public void filterOnTerm(Term term){
        ArrayList<Credit> temp = new ArrayList<Credit>();
        for(Credit value:chosenCredit){
            if(value.getTerm()==term ){
                temp.add(value);
            }
        }
        chosenCredit.clear();
        chosenCredit.addAll(temp);
    }


    public void filterOnCredit(CreditInput creditInput){
        ArrayList<Credit> temp = new ArrayList<Credit>();
        if(creditInput == CreditInput.INCREASE_PAYMENT_LINE){
            for(Credit value:chosenCredit){
                if((value.getClass() == new IncreaseLineCredit().getClass())){
                    temp.add(value);
                }
            }
        }
        else if(creditInput == CreditInput.PREPAYMENT_INCREASE){
            for(Credit value:chosenCredit){
                if((value.getClass() == new PrepaymentIncreaseLineCredit().getClass())){
                    temp.add(value);
                }
            }
        }
        else{
            if(creditInput == CreditInput.PREPAYMENT_LOAN){
                for(Credit value:chosenCredit){
                    if((value.getClass() == new PrepaymentCredit().getClass())){
                        temp.add(value);
                    }
                }
            }
        }
        chosenCredit.clear();
        chosenCredit.addAll(temp);
    }

    public void generateArray(int numberOfCredit){
        for(int i = 0; i < numberOfCredit; i++){
            if(i < numberOfCredit/3){
                activeCredit.add(new PrepaymentCredit());
            }
            else if(i < numberOfCredit/3*2){
                activeCredit.add(new PrepaymentIncreaseLineCredit());
            }
            else{
                activeCredit.add(new IncreaseLineCredit());
            }

        }
    }

    public ArrayList<Credit> getActiveCredit() {
        return activeCredit;
    }

    @Override
    public String toString() {
        return "Model{" +
                "activeCredit=" + activeCredit +
                ", chosenCredit=" + chosenCredit +
                '}';
    }



}
