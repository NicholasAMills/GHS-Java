import java.util.*;
public class Student
{
    int id,Choice;
    private String year, thesis1, name, clas;
    double gpa;
    Scanner kbReader = new Scanner(System.in);
    
    public int getName()
    {
        System.out.println("Who would you like to view?\n1.Sameer\n2.(blank)\n3.Mubin\n4.Shahid\nEnter the number and press Enter to continue...");
        Choice = kbReader.nextInt();
        return Choice;
    }

    public double getGPA()
    {
        if (Choice == 1)
        {
            gpa = 3.51;
            name = "Sameer";
            clas = "Student:";
        }
        if (Choice == 2)
        {
            gpa = 3.22;
            name = "";
            clas = "Student:";
        }
        if (Choice == 3)
        {
            gpa = 3.57;
            name = "Mubin";
            clas = "Graduate Student:";
        }
        if (Choice == 4)
        {
            gpa = 2.91;
            name = "Shahid";
            clas = "Undergraduate Student:";
        }
        return gpa;
    }

    public int getID()
    {
        if (Choice == 1)
        {
            id = 97000;
        }
        if (Choice == 2)
        {
            id = 98000;
        }
        if (Choice == 3)
        {
            id = 200_000;
        }
        if (Choice == 4)
        {
            id =99000;
        }
        return id;
        
    }
    public void year(String b)
    {
        year = b;
    }
    public void thesis(String a)
    {
        thesis1 = a;
    }
    public void FINALPART()
    {
        if (Choice == 1)
        System.out.println(clas + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "GPA: " + gpa);
     
        if (Choice == 2)
        System.out.println(clas + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "GPA: " + gpa);
        
        if (Choice == 3)
        System.out.println(clas + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "GPA: " + gpa + "\n" + "Thesis: "+ thesis1);
        
        if (Choice == 4)
        System.out.println(clas + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "GPA: " + gpa + "\n" + "Year: " + year);
    }
}
