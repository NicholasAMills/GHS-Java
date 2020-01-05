import java.io.*;
import java.util.*;
import java.text.*;
public class Candy
{
   double Total = 0;
   int Choice1, Choice2, Choice3;
   String Ca, Ch, D;
   Scanner kbReader1 = new Scanner(System.in);
   public double Candy()
   {
       System.out.println("Would you like: \n1. Snickers \n2. Twix \n3. Starbursts \n Enter the number for your selection");
       Choice1 = kbReader1.nextInt();
       if (Choice1 == 1)
       {
           Ca = "Snickers";
        }
       if (Choice1 == 2)
       {
           Ca = "Twix";
        }
       if (Choice1 == 3)
       {
           Ca = "Starburst";
        }
        Total += 1;
        return Total;
       // if (Ca != null)
       // return Ca;
    }
    
   public double Chips()
   {
      System.out.println("Would you like: \n1. BBQ Chips \n2. Doritos \n3. Cheetos \n Enter the number for your selection");
      Choice2 = kbReader1.nextInt();
      if (Choice2 == 1)
      {
          Ch = "BBQ Chips";
        }
      if (Choice2 == 2)
      {
          Ch = "Doritos";
        }
      if (Choice2 == 3)
      {
          Ch = "Cheetos";
        }
      Total += 0.75;
      return Total;
     // if (Ch != null)
      //return Ch;
    }
   
   public double Drink()
   {
      System.out.println("Would you like: \n1. Mtn Dew \n2. Dr. Pepper \n3. Cherry Coke \n Enter the number for your selection");
      Choice3 = kbReader1.nextInt();
      if (Choice3 == 1)
      {
          D = "Mtn Dew";
        }
      if (Choice3 == 2)
      {
          D = "Dr. Pepper";
        }
      if (Choice3 == 3)
      {
          D = "Cherry Coke";
        }
      Total += 1.5;
      return Total;
     // if (Ch != null)
      //return D;
    }
    
    public void Total()
    {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String str = fmt.format(Total);
    System.out.println("Your total is " + str);
    
    System.out.print("Enter payment amount: $");
    double pay = kbReader1.nextDouble();
    double Change = pay - Total;
    do{
    if (Change < 0)
    {
        System.out.println("Invalid amount");
        Change += pay;
    }
    }while(Change < 0);
    NumberFormat nt = NumberFormat.getCurrencyInstance();
    String change = nt.format(Change);
    System.out.println("Your change is " + change + ". Have a nice day");
}
}