
/**
 Main
 */
public class AccountTest
{
  public static void main(String args[])
  {
      TimeDepositAccount myAccount = new TimeDepositAccount(8, 4);
      
       ////SavingsAccount momsSavings = new SavingsAccount(5);
       
//       CheckingAccount harrysChecking = new CheckingAccount(100);
       
       //momsSavings.deposit(4000);
       myAccount.deposit(4000);
       myAccount.addInterest();
       myAccount.withdraw(200);
       
       
//       momsSavings.transfer(harrysChecking, 2000);
//       harrysChecking.withdraw(1500);
//       harrysChecking.withdraw(80);
       
//       momsSavings.transfer(harrysChecking, 1000);
//       harrysChecking.withdraw(400);
       
//       //simulate end of month
//       momsSavings.addInterest();
//       harrysChecking.deductFees();
       System.out.println("Mom's saving balance = $" + myAccount.getBalance());
       //System.out.println("Mom's saving balance = $" + momsSavings.getBalance());
       
//       System.out.println("Harry's checking balance = $" + harrysChecking.getBalance());
    }
}
