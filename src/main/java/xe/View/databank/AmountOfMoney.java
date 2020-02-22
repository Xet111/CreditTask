package xe.View.databank;

public enum AmountOfMoney {
    ONE_HUNDRED("1 - [100]"),
    FIVE_HUNDRED("2 - [500]"),
    ONE_THOUSAND("3 - [1000]");
    String money;
    AmountOfMoney(String money){
        this.money = money;
    }
    @Override
    public String toString(){
        return money;
    }
}
