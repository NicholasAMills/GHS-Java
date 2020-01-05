import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class DBTableDataMaker3
{
    public static void main (String [] args) throws FileNotFoundException
    {
        Random generator = new Random(); 
        
        PrintWriter out = new PrintWriter("LibraryData.csv");
        
        String[] gameNames = {"Team Fortress 2", "Garry's Mod", "Portal 2", "OneShot", "Counter-Strike", "Left 4 Dead 2", "GTA V"};
        String[] softwareNames = {"Wallpaper Engine", "Steam VR", "Steam Workshop"};
        String[] music = {"Angels Fall", "Viva La Vida", "Dearly Beloved", "America", "Carry on"};
        
        for (int i = 1; i<=1000; i++)
        {
            int index1 = generator.nextInt(gameNames.length);
            int index2 = generator.nextInt(softwareNames.length);
            int index3 = generator.nextInt(music.length);
            String typeName = gameNames[index1];
            String softName = softwareNames[index2];
            String musicName = music[index3];
            out.println(typeName + i + "," + softName + i + "," + musicName + i );
        }
        
        out.close();
    }
}
