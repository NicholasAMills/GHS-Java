import java.io.*;
import java.util.*;
public class Calculator
{
    private int Value1;
    private int Value2;
    public int A,S,M,Av,max,min;
    
    public Calculator()
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter the first number");
        Value1 = kbReader.nextInt();
        System.out.println("Enter the second number");
        Value2 = kbReader.nextInt();
        
    }
    
    public void Addition()
    {
        A = Value1 + Value2;
        System.out.println(A);
        System.out.println("Addition: " + A);
    }
    
    public void Subtraction()
    {
        S = Value1 - Value2;
        System.out.println("Subtraction: " + S);
    }
    
    public void Multiplication()
    {
        M = Value1 * Value2;
        System.out.println("Multiplication: " + M);
    }
    
    public void Average()
    {
        Av = M / 2;
        System.out.println("Average: " + Av);
    }
    
    public void Maximum()
    {
        max = Math.max(Value1,Value2);
        System.out.println("Maximum: " + max);
    }
    
    public void Minimum()
    {
        min = Math.min(Value1,Value2);
        System.out.println("Minimum: " + min);
    }
}