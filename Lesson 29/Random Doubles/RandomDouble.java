import java.io.*;
import java.util.*;
import java.text.*;
public class RandomDouble
{

    public RandomDouble()
    {
      double r = 0;
      Random rndm = new Random();
      for (int j = 0; j < 28; j++)
      {
          r = 99.78 + 47.44 * rndm.nextDouble();
          System.out.println(r);
        }
    }

}
