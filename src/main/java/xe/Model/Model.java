package xe.Model;

import xe.Model.creditfactory.PrepaymentCredit;
import xe.View.databank.AmountOfMoney;
import xe.Model.creditfactory.Credit;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {
    ArrayList<Credit> activeCredit = new ArrayList<Credit>();
    ArrayList<Credit> chosenCredit = new ArrayList<Credit>();


    private void filterOnAmount(AmountOfMoney amountOfMoney){
        for(Credit value:activeCredit){
            if(value.getAmount()==amountOfMoney){
                chosenCredit.add(value);
            }


        }
    }



}
