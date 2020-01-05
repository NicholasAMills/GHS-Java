import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
       String Year[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       String JanJun[] = new String[6];
       String JulDec[] = new String[6];
       
       System.arraycopy(Year,0,JanJun,0,6);
       //System.out.println(JanJun);
       
       System.arraycopy(Year,6,JulDec,0, 6);
       //System.out.println(JulDec);
       for(String varName:JanJun)
       {
        System.out.print(" " + varName);
      }
      
      for (String varName1:JulDec){
      System.out.print( " " + varName1);
      }
   }
}
