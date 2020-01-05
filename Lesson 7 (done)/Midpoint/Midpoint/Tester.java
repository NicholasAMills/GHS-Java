
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
     System.out.println("Enter your first x coordinate");
     int x1 = kbReader.nextInt();
     System.out.println("Enter your first y coordinate");
     int y1 = kbReader.nextInt();
     System.out.println("Enter your second x coordinate");
     int x2 = kbReader.nextInt();
     System.out.println("Enter your second y coordinate");
     int y2 = kbReader.nextInt();
     
     double i = (x1 + x2) / 2;
     double j = (y1 + y2) / 2;
     
     double d = Math.pow(x2-x1,2);
     double k = Math.pow(y2-y1,2);
     
     double distance = Math.sqrt(d + k);
     
     System.out.println("The distance between the points is " + distance );
     System.out.println("The midpoint between the points is (" + i + "," + j + ")");
     
    }

}
