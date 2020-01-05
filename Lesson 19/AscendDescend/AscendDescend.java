import java.io.*;
import java.util.*;

public class AscendDescend
{
    public static void main (String args[])
    {
       String[] names = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"}; 
        Arrays.sort(names);
        int index1 = 9;
        System.out.println("Ascending\t\tDescending\n");
    for(int index = 0; index < names.length; index++)
    {
        
        System.out.println(names[index] + "\t\t\t"  + names[index1] );
        index1--;
    
    }
   
}
}
