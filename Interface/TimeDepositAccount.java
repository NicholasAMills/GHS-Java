
/**
 * Write a description of class TimeDepositAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeDepositAccount extends SavingsAccount
{
    private int PTM;
    private static final double EWP = 100;
    public TimeDepositAccount(double r, int m)
    {
        super(r);
        PTM = m;
    }
    
    public void addInterest()
    {
        PTM--;
        super.addInterest();
    }
    
    public void withdraw(double amount)
    {
        if (PTM > 0)
        super.withdraw(EWP);
        super.withdraw(amount);
        
    }
}
