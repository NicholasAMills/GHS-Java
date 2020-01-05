
/**
 Nicholas Mills
 9/25/2014
 */

import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     System.out.print("Make your arithmetic selection from the choices below:\n");
System.out.println(" Addition");
System.out.println(" Subtraction");
System.out.println(" Multiplication");
System.out.println(" Division\n");
System.out.print(" Your choice? ");
Scanner kbReader = new Scanner(System.in);
String choice = kbReader.nextLine( );
//char ch = choice; //You would think this would work…but it doesn’t.
//char ch = choice.charAt(0); //you just learned another String method.
String cheese = choice;
System.out.print("\nEnter first operand. " );
double op1 = kbReader.nextDouble( );
System.out.print("\nEnter second operand." );
double op2 = kbReader.nextDouble( );
System.out.println(" ");
switch (cheese)
{
case "Addition": //addition
case "addition": //Notice we are providing for both capital A and little a.
System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
break;
case "Subtraction": //subtraction
case "subtraction":
System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
break;
case "Multiplication": //multiplication
case "multiplication":
System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
break;
case "Division": //division
case "division":
System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
break;
default:
System.out.println("Hey dummy, enter only a A, S, M, or D!");
}

    }
}
