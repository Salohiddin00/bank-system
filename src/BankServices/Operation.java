package BankServices;

public abstract class Operation {
    protected int date;
    protected double amount;

    public Operation(double amount, int date) {
        this.amount = amount;
        this.date = date;
    }
    public abstract String toString();
}
