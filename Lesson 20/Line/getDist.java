import java.util.*;
import java.io.*;
public class getDist
{
    public static double A,B,C;
    public static double x,y;
    
   public static void getDist(double A,double B,double C, double x, double y)
   {

            double a,b,c,d,e,f;
            a = Math.abs((A*x)+(B*y)+C);
            b = Math.pow(A,2);
            c = Math.pow(B,2);
            d = b+c;
            e = Math.sqrt(d);
            double k = Math.abs((A*x + B*y + C)/Math.sqrt((A*A+B*B)));
            
            //Math.abs((A*x)+(B*y)+C)/Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
            System.out.print(k);
            //return k;
        }
       

}

