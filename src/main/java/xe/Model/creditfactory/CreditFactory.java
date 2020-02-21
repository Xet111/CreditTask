package xe.Model.creditfactory;

import xe.View.databank.CreditInput;

public class CreditFactory {
    public Credit getCredit(CreditInput creditInput){
        Credit toReturn = null;
        switch (creditInput){
            case PREPAYMENT_LOAN:
                toReturn = new PrepaymentCredit();
                break;
            case PREPAYMENT_INCREASE:
                toReturn = new PrepaymentIncreaseLineCredit();
                break;
            case INCREASE_PAYMENT_LINE:
                toReturn = new IncreaseLineCredit();
                break;

        }
        return toReturn;
    }

}
