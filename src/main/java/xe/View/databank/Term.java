package xe.View.databank;

public enum Term {
    ONE_MONTH("1- [1 month]"),
    TWO_MONTH("2- [2 month]"),
    THREE_MONTH("3 - [3 month]");
    String month;
    Term(String month){
        this.month = month;
    }

    @Override
    public String toString() {
        return "Term{" +
                "month='" + month + '\'' +
                '}';
    }
}
