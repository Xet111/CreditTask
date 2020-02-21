package xe.View.databank;

public enum CreditInput {
    PREPAYMENT_LOAN("loan.prepay"),
    PREPAYMENT_INCREASE("loan.prepayment.increase"),
    INCREASE_PAYMENT_LINE("loan.increase");


    private String creditName;
    CreditInput(String creditName){
        this.creditName = creditName;

    }
    @Override
    public String toString(){
        return creditName;
    }
}
