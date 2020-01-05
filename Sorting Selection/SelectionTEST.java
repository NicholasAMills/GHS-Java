import java.util.Random;
import java.util.*;
public class SelectionTEST
{

    public static void main (String [] args)
    {
       int a[] = new int[20];
       Random generator = new Random();
       for(int i = 0; i < a.length; i ++)
        {a[i] = generator.nextInt(20) +1;
         System.out.print(a[i] + " ");}
       SelectionSorter s = new SelectionSorter(a);
       s.selectionSort();
       System.out.println(" \n Sorted Array");
       for (int j = 0; j < a.length; j++)
       {
           System.out.print(a[j] + " " );
        }
    }
    
   }
