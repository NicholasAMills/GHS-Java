
/**
Nicholas Mills
9/25/2014
 */

import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Please enter your full name");
     String name = kbReader.nextLine();
     int len = name.length();
     name = name.toLowerCase();
     String f = "";
     String l = "";
     for (int i = len; i>0; i--)
     {
         f = name.substring(i-1,i);
         l = l + f;
        }
         System.out.print(l);
    }
   
}

