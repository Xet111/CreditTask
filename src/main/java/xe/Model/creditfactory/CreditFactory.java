package xe.Model.creditfactory;

public class CreditFactory {
    public Credit getCredit(xe.View.databank.Credit credit){
        Credit toReturn = null;
        switch (credit){
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
