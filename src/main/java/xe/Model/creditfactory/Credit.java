package xe.Model.creditfactory;
import xe.View.databank.AmountOfMoney;
import xe.View.databank.Bank;
public abstract class Credit {
    private AmountOfMoney amount;
    private float monthPercent;
    private int term;
    private String bank;

    public Credit(){
        this.amount = AmountOfMoney.FIVE_HUNDRED;
        this.monthPercent = 0.5f+(float)Math.random()*2.5f;
        this.term = 1 +(int)Math.random()*12;
        switch ((int)Math.random()*3){
            case 0:
                this.bank = Bank.PRIVATBANK.toString();
                break;
            case 1:
                this.bank = Bank.CREDIT_AGRICOLE.toString();
                break;
            case 2:
                this.bank = Bank.RAYFAYZEN_BANK.toString();
                break;
            case 3:
                this.bank = Bank.BONK.toString();
        }
    }

    public AmountOfMoney getAmount() {
        return amount;
    }

    public float getMonthPercent() {
        return monthPercent;
    }

    public int getTerm() {
        return term;
    }

    public void setAmount(AmountOfMoney amount) {
        this.amount = amount;
    }

    public void setMonthPercent(float monthPercent) {
        this.monthPercent = monthPercent;
    }

    public void setTerm(int term) {
        this.term = term;
    }

}
