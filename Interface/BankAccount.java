/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals.
 */

public class BankAccount
{
    private double balance;
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double b)
    {
        balance = b;
    }

    public void deposit(double d)
    {
        balance += d;
    }

    public void withdraw(double w)
    {
        balance -= w;
    }

    public void transfer(BankAccount other, double a)
    {
        withdraw(a);
        other.deposit(a);
    }

    public double getBalance()
    {
        return balance;
    }
}