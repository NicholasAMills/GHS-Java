import java.io.*;
import java.util.*;
public class Tester
{

    public static void main (String args[])
    {
        String[] names = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"}; 
 
	    Arrays.sort(names);
 

	for(int index = 0; index < names.length; index++){
		System.out.println(names[index]);
	}
    }
}
