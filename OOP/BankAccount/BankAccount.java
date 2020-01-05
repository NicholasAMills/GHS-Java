 import java.io.*;
 import java.util.*;
 
public class BankAccount
{
    // instance variables to hold the balance
    public int balance;
    public String name;
   
    
    public BankAccount()
    {
        // initialise instance variables
        balance = 0;
    }
    
    public BankAccount(int b)
    {
      //initialize instance variable  
      balance = b;   
    }
    
    public BankAccount(String n, int b)
    {
        name = n; 
        balance = b;
    }
    
    public void withdraw(int w)
    {
        Scanner kbReader = new Scanner(System.in);
        balance -= w; //subtracting the witdraw amount from balance
    }
    
    public void deposit(int d)
    {
        // adding the deposit amount to balance
        balance += d;
    }
    
    public int getBalance()
    {
        return balance;//returning back to main the balance
    }
    
    public String getName()
    {
        return name;
    }
        
}
