package xe.Model.creditfactory;
import xe.View.View;
import xe.View.databank.AmountOfMoney;
import xe.View.databank.Bank;
import xe.View.databank.Term;

public abstract class Credit {
    private AmountOfMoney amount;
    private float monthPercent;
    private Term term;
    private String bank;

    public Credit(){
        switch ((int)(Math.random()*3)){
            case 0:
                this.amount = AmountOfMoney.ONE_HUNDRED;
                break;
            case 1:
                this.amount = AmountOfMoney.FIVE_HUNDRED;
                break;
            case 2:
                this.amount = AmountOfMoney.ONE_THOUSAND;
                break;
        }

        this.monthPercent = 0.5f+(float)Math.random()*2.5f;

        switch ((int)(Math.random()*3)){
            case 0:
                this.term = Term.ONE_MONTH;
                break;
            case 1:
                this.term = Term.TWO_MONTH;
                break;
            case 2:
                this.term = Term.THREE_MONTH;
                break;
        }

        switch ((int)(Math.random()*4)){
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

    public Term getTerm() {
        return term;
    }

    public void setAmount(AmountOfMoney amount) {
        this.amount = amount;
    }

    public void setMonthPercent(float monthPercent) {
        this.monthPercent = monthPercent;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "amount=" + amount +
                ", monthPercent=" + monthPercent +
                ", term=" + term +
                ", bank='" + new View().getLocalizedText( bank )+ '\'' +
                '}';
    }
}
