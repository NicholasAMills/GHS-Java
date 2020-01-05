import java.io.*;
import java.util.*;
public class DistToLineTester
{
    public static double A,B,C,x,y,k;
        
    public static void main(String args[])
    {
        System.out.println("Enter the x coordinate");
        Scanner kbReader = new Scanner(System.in);
        x = kbReader.nextDouble();
        System.out.println("Enter the y coordinate");
        y = kbReader.nextDouble();
        System.out.println("Enter A");
        A = kbReader.nextDouble();
        System.out.println("Enter B");
        B = kbReader.nextDouble();
        System.out.println("Enter C");
        C = kbReader.nextDouble();
        
        getDist.getDist(A,B,C,x,y);
        //System.out.println(k);
       
    }
}