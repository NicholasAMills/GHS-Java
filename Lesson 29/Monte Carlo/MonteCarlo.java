import java.io.*;
import java.util.*;

public class MonteCarlo
{      public static int sqrCount = 0;
       public static int cirCount = 0;
        double y = 0;
        double x = 0;
   public void nextRainDrop_x()
   {
     
      Random rndm = new Random();
    
      
          x = 20* rndm.nextDouble();
          
        
      
    }
    
   public void nextRainDrop_y()
   {
     
      Random rndm2 = new Random();
      
      
          y = 20* rndm2.nextDouble();
       
       
   }
   
   public void insideCircle()
   {
       boolean yesno;
       double num1 = x - 10; //0 is the "h" variable
       double num2 = Math.pow(num1,2);
       double num3 = y - 10; //0 is the "k" variable
       double num4 = Math.pow(num3,2);
       double num5 = num2 + num4;
     
       
       if (num5 <= 25) //5 is radius
       {
           yesno = true;
        }
       else
       {
           yesno = false;
        }
       
       if (yesno == true)
      
           cirCount++;
           
       
       
    }
    public void insideSquare()
    {
    if (x <= 10 && y<= 10) //5 is radius
       {
           sqrCount ++;
        }
    
    }
    
}
