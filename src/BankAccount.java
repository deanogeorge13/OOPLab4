public abstract class BankAccount implements Transactable, Taxable{
    protected String name;
    protected int accNum;

    public abstract void lodge(double a);
    public abstract void withdraw(double a);

    public BankAccount(String name, int accNum)
    {
        setName(name);
        setAccNum(accNum);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccNum(int accNum)
    {
        this.accNum = accNum;
    }

    public String getName()
    {
        return name;
    }

    public int getAccNum()
    {
        return accNum;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "\nAccount Num: " + getAccNum();
    }
}
