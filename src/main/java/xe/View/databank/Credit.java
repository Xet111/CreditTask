package xe.View.databank;

public enum Credit {
    PREPAYMENT_LOAN("loan.prepay"),
    PREPAYMENT_INCREASE("loan.prepayment.increase"),
    INCREASE_PAYMENT_LINE("loan.increase");


    private String creditName;
    Credit(String creditName){
        this.creditName = creditName;

    }
    @Override
    public String toString(){
        return creditName;
    }
}
