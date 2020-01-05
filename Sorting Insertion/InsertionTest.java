ximport java.util.Random;
public class InsertionTest
{
    
   public static void main(String args[])
   {
       int a[] = new int[20];
       Random generator = new Random();
       for (int i = 0; i < a.length; i++)
       {
           a[i] = generator.nextInt(20) + 1;
           System.out.print(a[i] + " ");
        }
       
       InsertionSort insert = new InsertionSort(a);
       insert.insertionSort();
       System.out.println(" \n Sorted Array");
       for (int j = 0; j < a.length; j++)
       System.out.print (a[j] + " ");
   }
}
