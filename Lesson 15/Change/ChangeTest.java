import java.io.*;
import java.util.*;
public class ChangeTest
{
    public static void main (String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter the amount of change you have: \n$0.");
        int x = kbReader.nextInt();
        
        Change myChange = new Change(x);
        
        System.out.println("Quarters: " + myChange.Quarters());
        System.out.println("Dimes: " + myChange.Dimes());
        System.out.println("Nickels: " + myChange.Nickels());
        System.out.println("Pennies: " + myChange.Pennies());
    }
}
