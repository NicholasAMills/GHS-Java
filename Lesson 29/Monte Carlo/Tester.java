import java.util.*;
import java.io.*;
import java.text.*;
  public class Tester
  {
   
    public static void main (String args[])
    {
      
       
       int r = 5;
       
        MonteCarlo mcObj = new MonteCarlo(); //object
        for(int ct = 0; ct <=1_000_000; ct++){
        mcObj.nextRainDrop_x(); //getting random # for x
        mcObj.nextRainDrop_y(); //getting random # for y
        mcObj.insideCircle(); //seeing if (x,y) is in/on circle
        mcObj.insideSquare();
       }
       double pi = (double)(MonteCarlo.cirCount * Math.pow(10,2)) / (MonteCarlo.sqrCount * Math.pow(r,2));
       System.out.println(pi);
    }
  }
