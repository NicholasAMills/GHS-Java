
/**
 Nicholas Mills
 9/9/2014
 */
public class Tester
{
    public Tester()
    {
      double d1 = 37.9;
      double d2 = 1004.128;
      int i1 = 12;
      int i2 = 18;
      
      double Problem1 = 57.2 * (i1 / i2) +1; //plugging variables in problems
      double Problem2 = 57.2 * ((double)i1 / i2) + 1;
      double Problem3 = 15 - i1 * (d1 * 3) + 4;
      double Problem4 = 15 - i1 * (int)(d1 * 3) + 4;
      double Problem5 = 15 - i1 * ((int)d1 * 3) + 4;
      
      System.out.println(Problem1); //outputting solutions
      System.out.println(Problem2);
      System.out.println(Problem3);
      System.out.println(Problem4);
      System.out.println(Problem5);
    }
}
