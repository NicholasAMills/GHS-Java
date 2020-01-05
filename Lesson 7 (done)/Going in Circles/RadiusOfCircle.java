/**
 Nicholas Mills
 9/11/2014
 */

import java.io.*;
import java.util.*;
public class RadiusOfCircle
{
   
    public static void main( String args[])
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter the area of the circle.");
     double d = kbReader.nextDouble(); //user inserts info
     double PI = Math.PI; //variable for PI to make life easier
     double answer = d/PI; 
     String s = "The final anser is ";
     System.out.print(s); 
     System.out.println(Math.sqrt(answer));
    }

}
