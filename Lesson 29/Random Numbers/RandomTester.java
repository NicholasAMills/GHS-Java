import java.io.*;
import java.util.*;
import java.text.*;
public class RandomTester
{

    public RandomTester()
    {
       int r = 0;
       Random rndm = new Random();
       for(int j = 0; j < 34; j++){
           r = 71 + rndm.nextInt(29);
           System.out.println(r);
        }
    }

}
