
/**
 Nicholas Mills
 9/19/2014
 */
import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     System.out.print("Please input a number 1 - 5. \n");
     Scanner kbReader = new Scanner(System.in);
     int choice = kbReader.nextInt();
     switch(choice) //"choice" is the integer
     {
         case 1: System.out.println(choice);
         break; 
         case 2: System.out.println(choice);
         break;
         case 3: System.out.println(choice);
         break;
         case 4: System.out.println(choice);
         break;
         case 5: System.out.println(choice);
         break;
         default: System.out.println("Only numbers 1 - 5");
        }
     
    }
}
