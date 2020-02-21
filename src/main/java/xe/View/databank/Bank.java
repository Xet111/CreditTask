package xe.View.databank;

public enum Bank {
    PRIVATBANK("bank.privat"),
    RAYFAYZEN_BANK("bank.rayfayzen"),
    CREDIT_AGRICOLE("bank.agricole"),
    BONK("bank.bonk");
    private String bankName;
    Bank(String bankName){
        this.bankName = bankName;
    }
    @Override
    public String toString(){
        return bankName;
    }
}
