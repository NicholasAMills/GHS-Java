
public class Compare
{
    public Compare()
    {
      int a[] = {1, 2, 3, 4, 5};
      int b[] = {0, 0, 0, 0, 0};
      
      for (int index = 0; index < a.length; index++)
      {
          b[index] = a[index];
        }
        System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3] +" " + b[4]);
    }
}
