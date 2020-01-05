import java.io.*;
import java.util.*;
/**
 * Write a description of class Lesson18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lesson18
{
    
    public void getNumbers()
    {
        //Program 1
        Scanner kbReader = new Scanner(System.in);
        int Numbers[] = new int[5];
        System.out.println("Enter 5 numbers");
        Numbers[0] = kbReader.nextInt();
        Numbers[1] = kbReader.nextInt();
        Numbers[2] = kbReader.nextInt();
        Numbers[3] = kbReader.nextInt();
        Numbers[4] = kbReader.nextInt();

        int sum = Numbers[0] + Numbers[1] - Numbers[2] + Numbers[3] - Numbers[4];
        System.out.println(Numbers[0] + " + " + Numbers[1] + " - " + Numbers[2] + " + " + Numbers[3] + " - " + Numbers[4] + " + " + " = " + sum);
    }
    
    public void TwoArrays()
    {
        //Program 2
        int[] val = {13, -4, 82, 17};
        int[] twice = {26, -8,164 , 34};
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2]+ " " + val[3]);
        System.out.println("New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
    
    public void ThreeArrays()
    {
        //program 3
        int[] valA = {13,-22,82,17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = {0, 0, 0, 0};
        sum[0] = valA[0] + valB[0];
        sum[1] = valA[1] + valB[1];
        sum[2] = valA[2] + valB[2];
        sum[3] = valA[3] + valB[3];
        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
    }
    
    public void Sum()
    {
     int[] valA   = { 13, -22,  82,  17}; 
     int[] valB   = { 12,  47 , -57,  8};
    
    // Put values into valB so that the sum of the values
    // in corresponding cells of valA and valB is 25.
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );

    }
    
    public void Reverse()
    {
     int[] val = {0, 1, 2, 3}; 
     int temp;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array

    System.out.println( "Reversed Array: " 
        + val[3] + " " + val[2] + " " + val[1] + " " + val[0] );

    }
    
    public void evenodd()
    {
      int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    // declare and initialize three sums
    // compute the sums
    int sumEven = 0;
    int sumOdd = 0;
    for ( int index=0; index < data.length; index++)
    {
        if (data[index] % 2 == 0)
        {
            sumEven = sumEven + data[index];
        }
        else
        {
            sumOdd = sumOdd + data[index];
        }
    }
     
    int sumTotal = sumOdd + sumEven;
    // write out the three sums
    System.out.println("Even: " + sumEven);
    System.out.println("Odd: " + sumOdd);
    System.out.println("Total: " + sumTotal);

    }
    
    public void Elements()
    {
      int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
      int x = 0;
      int q = 0;
      int w = 0;
    // declare and initialize variables for the two largest  
    // compute the two largest
    for ( int index= 0; index < data.length; index++)
    {
        if (x < data[index])
        x = data[index];
        
    }
    for (int index = 0; index < data.length; index++)
    {
       
        if (q < data[index] )
        w = data[index];
        if (w != x)
        q = w; 
        
         
    }
    
    
    
    
    // write out the two largest
    System.out.println(x + " " + q);
    }
    
    public void Zero()
    {
     int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    // find the element nearest to zero
     int smallest = 10000;
    for (int index = 0; index < data.length; index++)
    {
       data[index] = Math.abs(data[index]);
      
       if (smallest > data[index])
       {
           smallest = data[index];
        }

        
        
    }
    // write out the element nearest to zero
    System.out.println (smallest + " is closest to 0");

    }
}
