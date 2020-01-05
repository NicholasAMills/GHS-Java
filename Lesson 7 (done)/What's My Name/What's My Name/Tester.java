
/**
 Nicholas Mills
 9/16/2014
 */

import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("What is your first name?");
     String s1 = kbReader.next();
     System.out.println("What is your last name?");
     String s2 = kbReader.next();
     System.out.print("Your name is " + s1 + " " + s2 + ".");
    }
}
