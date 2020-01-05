
/**
 Nicholas Mills
 10/2/2014
 */

import java.io.*;
import java.util.*;
public class tester
{
    public tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter your age");
     int i = kbReader.nextInt();
     if (i < 16)
     {
         System.out.println("You can't drive.");
        }
     else if (i >= 16 && i <= 17)
        {
         System.out.println("You can drive but not vote.");
        }
     else if (i >= 18 && i <= 24)
        {
         System.out.println("You can vote but not rent a car.");
        }
     else if(i >24)
        {
         System.out.println("You can do pretty much anything");
        }
        
    }
}
