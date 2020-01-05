import java.io.*;
import java.util.*;
public class Name
{
    public Name()
    {
       Scanner kbReader = new Scanner(System.in);
       System.out.println("Enter your name");
       String N = kbReader.nextLine();
       
       char ch[];
       ch = N.toCharArray();
       int counter = 0;
       for (char varName:ch)
       {
         System.out.print(" '" + varName + "'" + " ");
    }
    boolean TF;
    
        System.out.println("Search for a letter");
        String x = kbReader.nextLine();
        char x1[] = x.toCharArray();
        for (int index = 0; index < ch.length; index++)
        {
        if(x1[0]==(ch[index]))
        {
            TF = true;
            System.out.println(TF);
            break;
        }
        else
        {
            counter++;
        }
        if (counter == ch.length)
        System.out.println("false");
    }
   
    }
   
    }

