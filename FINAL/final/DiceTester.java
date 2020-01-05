import java.io.*;
import java.util.*;
public class DiceTester
{
   public static void main(String args[])
   {
       int answer;
       do{
       Scanner kbReader = new Scanner(System.in);
       System.out.println("How many times would you like to roll the dice? (Max of 20)"); //asking how many times they would like to roll
       int times = 0;
       int reroll;
       do //getting roll and error checking
       {
           times = kbReader.nextInt(); //getting roll
           if (times < 0 || times > 21)
           System.out.println("Pick a number > 0 and < 20");
        }
        while(times < 0 || times > 21);
       
       Dice myDice = new Dice(); //object
       myDice.Dice(times); //going into the .Dice method
       System.out.println("Would you like to roll again?\nEnter 1 to reroll, or type any other number to exit");
       answer = kbReader.nextInt();
    }
    while(answer == 1); //loop to repeat cycle if needed
    
   }
}
