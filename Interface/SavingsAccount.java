
/**
 An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{
   private double interestRate;
   public SavingsAccount(double i)
   {
       interestRate = i;
   }
    
   public void addInterest()
   {
       double interest = getBalance() * (interestRate/100);
       deposit(interest);
   }
}
