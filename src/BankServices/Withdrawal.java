package BankServices;

public class Withdrawal extends Operation{
    public Withdrawal(int date,double amount){
        super(amount, date);
    }
    @Override
    public String toString() {
        return "";
    }
}
