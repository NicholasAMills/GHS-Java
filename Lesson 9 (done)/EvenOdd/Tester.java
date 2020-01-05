
/**
 Nicholas Mills
 9/24/2014
 */
import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Please enter an integer and I will tell you if it's even or odd.");
     int i = kbReader.nextInt();
     if (i % 2 == 0)
        System.out.println("You're number is even.");
     else
        {System.out.println("You're number is odd.");}
    }
}
