import java.io.*;
import java.util.*;
public class Tester
{
   public static void main (String args[])
   {
       Scanner kbReader = new Scanner(System.in);
       System.out.print("Enter an integer to conver to binary: ");
       int x = kbReader.nextInt();
       System.out.println(x + " converted to binary is: " + convertToBinary.convertToBinary(x));
    }
   
}
