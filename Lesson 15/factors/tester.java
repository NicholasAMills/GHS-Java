
import java.io.*;
import java.util.*;
public class tester
{
    public static void main (String args[])
  {
      System.out.print("Enter an integer: ");
      Scanner kbReader = new Scanner (System.in);
      int i = kbReader.nextInt();
      FactorGenerator factor = new FactorGenerator(i);
      factor.factor(i);
      
    }
}
