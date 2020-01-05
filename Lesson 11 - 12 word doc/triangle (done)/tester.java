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
     System.out.println("Enter the smallest side");
     double s1 = kbReader.nextDouble();
     System.out.println("Enter side middle side");
     double s2 = kbReader.nextDouble();
     while (s2 < s1)
     {
         System.out.println(s2 + " is smaller than " + s1 + ". Please try again");
         s2 = kbReader.nextDouble();
     }
     System.out.println("Enter the largest side");
     double s3 = kbReader.nextDouble();
     while (s3 < s2)
     {
         System.out.println(s3 + " is smaller than " + s2 + ". Please try again");
         s3 = kbReader.nextDouble();
        }
     System.out.println("Your three sides were " + s1 + " " + s2 + " " + s3);
     double s11 = Math.pow(s1,2);
     double s22 = Math.pow(s2,2);
     double s33 = Math.pow(s3,2);
     
     if (s11 + s22 == s33)
        {
           System.out.print("These sides do make a right triangle");
        }
     else
        {
            System.out.println("These sides do not make a right triangle");
        }
    }
    
}
