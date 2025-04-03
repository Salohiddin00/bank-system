package BankServices;

public class Deposit extends Operation{
    public Deposit(int date,double amount){
        super(amount, date);
    }
    @Override
    public String toString() {
        return date+","+amount;
    }
}
