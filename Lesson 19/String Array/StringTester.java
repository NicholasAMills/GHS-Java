
public class StringTester
{
    /**
     * Constructor for objects of class StringTester
     */
    public StringTester()
    {
       String a[] = {"Cat", "Fish"};
       String b[] = {"Cat", "Dog"};
       if (a[0].equals(b[0]))
       System.out.println("Yes, they do match");
       else
       System.out.println("No, they don't match");
    }
}
