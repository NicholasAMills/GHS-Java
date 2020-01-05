import java.io.*;
import java.util.*;
public class Dice
{
    public void Dice(int times)
    {
        //Getting random numbers and outputting them in order
        int One = 0, Two = 0, Three = 0, Four = 0, Five = 0, Six = 0, Seven = 0, Eight = 0; //numbers for frequency
        double Ave1 = 0, Ave2 = 0, Ave3 = 0, Ave4 = 0, Ave5 = 0, Ave6 = 0, Ave7= 0, Ave8 = 0;
        int random = 0;
        int count = 0; //counting to put number into array
        int array[] = new int[times]; //declaring array
        Random rndm = new Random(); //random class
        for(int j = 0; j < times; j++) //getting random number
         {
          random = 1 + rndm.nextInt(8);  
           //frequency table 
            if(random == 1) 
               { One++; //Frequency counter
                Ave1+=1;} //Average counter
            if(random == 2)
                {Two++;
                 Ave2+=2;}
            if(random == 3)
               { Three++;
                 Ave3+=3;}
            if(random == 4)
                {Four++;
                 Ave4+=4;}
            if(random == 5)
                {Five++;
                 Ave5+=5;}
            if(random == 6)
                {Six++;
                 Ave6+=6;}
            if(random == 7)
                {Seven++;
                 Ave7+=7;}
            if(random == 8)
                {Eight++;
                 Ave8+=8;}
           
           array[count] = random; //
           count++;
         }
         Arrays.sort(array); //sorting array
         System.out.print("Your rolls were: "); //outputting results in order
        for(int index = 0; index < array.length; index++){
        System.out.print(array[index] + " ");
        }
     
        System.out.println("\nThere were:\n" + One + " one's,\n" + Two + " two's,\n" + Three + " three's,\n" + Four + " four's,\n" + Five + " five's,\n" + Six + " sixes,\n" + Seven + " seven's,\n" + Eight + " eight's");
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //Mean
        double ave = ((Ave1) +(Ave2) + (Ave3) + Ave4 + Ave5 + Ave6 + Ave7 + Ave8)/2;
        double sum = (Ave1) +(Ave2) + (Ave3) + Ave4 + Ave5 + Ave6 + Ave7 + Ave8;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + ave);
        //////////////////////////////////////////////////////////////////////////////////////////////
        //mode
        
        
    }
}
