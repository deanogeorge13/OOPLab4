public class SavingsAccount extends BankAccount{
    private double balance;

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public SavingsAccount(double balance, String name, int accNum)
    {
        super(name, accNum);
        setBalance(balance);
    }

    public double getBalance()
    {
        return balance;
    }

    public double calcTax()
    {
        return getBalance()*.25;
    }

    public void lodge(double a)
    {
        setBalance(getBalance()+a);
    }

    public void withdraw(double a)
    {
        setBalance(getBalance()-a);
    }
}
