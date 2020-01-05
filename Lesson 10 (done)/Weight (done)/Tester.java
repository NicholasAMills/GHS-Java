
/**
 Nicholas Mills
 9/22/2014
 */

import java.io.*;
import java.util.*;
public class Tester
{
    public Tester()
    {
     Scanner kbReader = new Scanner(System.in);
     System.out.println("Enter your weight on earth. \n");
     double weight = kbReader.nextDouble();
     System.out.println("Choose a planet to compare weight: Voltar, Krypton, Fertos, Servontos");
     String s = kbReader.next();
     
     switch(s)
     {
         case "Voltar":
            weight = weight * 0.091;
            System.out.println("Your weight on Voltar would be " + weight);
            break;
         case "Krypton":
            weight = weight * 0.720;
            System.out.println("Your weight on Krypton would be " + weight);
            break;
         case "Fertos":
            weight = weight * 0.865;
            System.out.println("Your weight on Fertos would be " + weight);
            break;
         case "Servontos":
            weight = weight * 4.612;
            System.out.println("Your weight on Servontos would be " + weight);
            break;
         default: 
            System.out.println("Please enter one of the planets only");
            break;
        }
    }
}
