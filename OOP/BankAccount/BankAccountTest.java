import java.io.*;
import java.util.*;

public class BankAccountTest
{
   public static void main (String[] args)
   {
       Scanner kbReader = new Scanner(System.in);
       System.out.println("How much do you want to withdraw?");
       int w = kbReader.nextInt();
       //create an object of BankAccount type
       BankAccount myAccount1 = new BankAccount(500);
       BankAccount myAccount = new BankAccount();
       BankAccount myAccount2 = new BankAccount("Nicholas Mills", 50000);
       
       //deposit $200
       myAccount.deposit(200);
       System.out.println("New Balance: " + myAccount.getBalance());
       //deposit $1,500
       myAccount1.deposit(1500);
       System.out.println("new Balance: " + myAccount1.getBalance());
       //deposit $400
       myAccount2.deposit(400);
       System.out.println("New Balance for " + myAccount2.getName() + ": " + myAccount2.getBalance());
       
       
       //withdraw $50
       myAccount.withdraw(500);
       System.out.println("New Balance: " + myAccount.getBalance());
       
       
       
       
       
   }
}
