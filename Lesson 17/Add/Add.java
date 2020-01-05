import java.io.*;
import java.util.*;

public class Add
{
public void bob()
{
Scanner kb = new Scanner(System.in);
System.out.print("Enter something like 8 + 33 + 1,345 - 137 : ");
String s = kb.nextLine( ); //Best to store in a String and then create a new Scanner
//object; otherwise, it can get stuck waiting for input.
Scanner sc = new Scanner(s);
//Set delimiters to a plus sign surrounded by any amount of white space...or...
// a minus sign surrounded by any amount of white space.
sc.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*");

int sum = 0;


while(sc.hasNextInt())
{
if(sc.findInLine("\\s*\\+\\s*") != null)
{    
    sum = sum + sc.nextInt();
    
}

if(sc.findInLine("\\s*\\-\\s*") != null)
{    
    sum = sum - sc.nextInt();
    
}

}
System.out.println("Sum is: " + sum);
}
}