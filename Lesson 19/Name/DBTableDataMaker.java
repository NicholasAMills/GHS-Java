import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;
public class DBTableDataMaker
{
    public static void main (String [] args) throws FileNotFoundException
    {
        Random generator = new Random(); 
        
        PrintWriter out = new PrintWriter("GameData.csv");
        
        String[] gameNames = {"Team Fortress 2, 0", "Garry's Mod, 9.99", "Portal 2, 19.99", "OneShot, 9.99", "Counter-Strike, 14.99", "Left 4 Dead 2, 4.99", "GTA V, 59.99"};
        
        
        
        for (int j = 1; j <= 1000; j++)
        {
            int GamesOwned = generator.nextInt(gameNames.length) + 1;
            
            for (int i = 1; i <= GamesOwned; i++)
            {
                int index = generator.nextInt(gameNames.length);
                String typeName = gameNames[index];
                int hoursPlayed = generator.nextInt(1000);
                out.println(typeName + j + "," + hoursPlayed);
                
                
            }
        }
        
        out.close();
    }
}
