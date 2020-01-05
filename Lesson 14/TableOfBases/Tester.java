
/**
 Nicholas Mills
 10/6/2014
 */
public class Tester
{
    public Tester()
    {
      System.out.print("Decimal\tBinary\tOctal\tHex\tCharacter\n");   
     for (int i = 65; i <=90; i++)
     {
        
         System.out.print(i + "\t" + Integer.toString(i,2) + "\t");
         System.out.print(Integer.toString(i,8) + "\t");
         System.out.print(Integer.toString(i,16) + "\t");
         char ch = (char) i;
         System.out.print(ch + "\n");
    }    
    }
}
