
/**
A checking account that charges transaction fees.
 */
public class CheckingAccount extends BankAccount
{
    private int tCount;
    private static final int FREE_T = 3;
    private static final double T_FEE = 0.2;
    public CheckingAccount(int b)
    {
        super(b);
        tCount = 0;
    }

    public void deposit(double d)
    {
        tCount++;
        super.deposit(d);
    }

    public void withdraw(double w)
    {
        tCount++;
        super.withdraw(w);
    }

    public void deductFees()
    {
        if (tCount > FREE_T)
        {
            double fee = T_FEE * (tCount - FREE_T);
            super.withdraw(fee);
        }
        tCount = 0;
    }
}
