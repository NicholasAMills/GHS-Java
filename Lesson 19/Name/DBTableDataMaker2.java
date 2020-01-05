import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class DBTableDataMaker2
{
    public static void main (String [] args) throws FileNotFoundException
    {
        Random generator = new Random(); 
        
        PrintWriter out = new PrintWriter("PlayerData.csv");
        
        for (int i = 1; i<=1000; i++)
        {
            int dollar = generator.nextInt(100);
            int cents = generator.nextInt(99);
            String walletValue = dollar + "." + cents;
            int number = generator.nextInt(1000);
            out.println("email" + i + "@mail.com" + "," + "user" + i + "," + walletValue);
        }
        
        out.close();
    }
}
