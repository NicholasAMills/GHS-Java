import java.io.*;
import java.util.*;
public class Crypto2
{
  public String encrypt(String s)
  {
     //Scanner kb = new Scanner(System.in);
     //System.out.println("Enter a sentence that is to be encrypted: ");
     //String sntnc = kb.nextLine();
     //System.out.println("Original sentence = " + sntnc);
     String sntnce = s;
     sntnce = sntnce.toLowerCase();
     sntnce = sntnce.replace("v", "aw',q");
     sntnce = sntnce.replace("m", "sskd");
     sntnce = sntnce.replace("g", "jcz..w");
     sntnce = sntnce.replace("b", "dul>?");
     return sntnce;
    }
  
  public String decrypt(String b)
  {
     String sntnce2 = b;
     sntnce2 = sntnce2.toLowerCase();
     sntnce2 = sntnce2.replace("aw',q", "v");
     sntnce2 = sntnce2.replace("sskd", "m");
     sntnce2 = sntnce2.replace("jcz..w", "g");
     sntnce2 = sntnce2.replace("dul>?", "b");
     return sntnce2;
  }
}
