import java.io.*;
import java.util.*;
import java.text.*;
public class CandyTester
{
    public CandyTester()
    {
       Scanner kbReader = new Scanner(System.in);
       Candy mychoice = new Candy();
       int Choice;
       
       
       do{
       System.out.println("What would you like to buy?");
       System.out.println("1. Candy ($1.00) \n2. Chips ($0.75) \n3. Drink ($1.50) \n4. Done \nEnter the number for your selection.");
       Choice = kbReader.nextInt();
       if (Choice == 1)
       {
           mychoice.Candy();
       }
       
       if (Choice == 2)
       {
           mychoice.Chips();
       }
    
       if (Choice == 3)
       {
           mychoice.Drink();
        }
       if (Choice == 4)
       {
           mychoice.Total();
        }
      }
      while(Choice != 4);
   
  }
}
