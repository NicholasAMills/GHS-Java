import java.util.* ;
import java.io.*;

public class DivisionPractice
{
  public static void main ( String[] a ) 
  {
    Scanner scan = new Scanner( System.in  );
    int   num = 0,  div=0 ;
    String strnum;
    
    System.out.print("Enter the numerator: ");
    strnum = scan.next();
    if(strnum.contains ("q") || strnum.contains("Q"))
    {
    System.out.println("Goodbye!");
    System.exit(0);
    }
    try
    { 
      num = Integer.parseInt(strnum);
      System.out.print("Enter the divisor: ");
      div = scan.nextInt();
      System.out.println( num + " / " + div + " is " + (num/div) + " rem " + (num%div) );
     } 
     catch (InputMismatchException ex )
     { 
      
      System.out.println("You entered bad data." );
      System.out.println("Please try again." );
     }
     catch (ArithmeticException ex )
     { 
      System.out.println("You can't divide " + num + " by " + div);
     } 
     catch(NumberFormatException ex)
     {
         System.out.println("You entered bad data." );
      System.out.println("Please try again." );
    }
    
}
}