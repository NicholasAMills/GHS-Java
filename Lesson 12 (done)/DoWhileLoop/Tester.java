
/**
 Nicholas Mills
 9/23/2014
 */
import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter a number to be squared or enter '0' to quit");
     double j;
     do
     {
     double x = kbReader.nextDouble();
         j = x;
         int i = 2;
         double y = Math.pow(x,i);
         System.out.println(y);
        
        }
     while(j != 0);
    }
}
