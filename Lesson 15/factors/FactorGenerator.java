

public class FactorGenerator
{
    private int input;
    private int counter ;
    private double leftover;
    private int a;
    /**
     * Constructor for objects of class FactorGenerator
     */
    public FactorGenerator(int b)
    {
        // initialise instance variables
        input = b;
    }

  
  
  public void factor(int b)
  {
      input = b;
      int counter = 2;
      do
      {
          double A = input % counter;
          if (A == 0)
          {
              System.out.println(counter + " ");
              leftover = input / counter;
              input = (int)leftover;
              
            }
            else
            {
             counter++;
           }
            
           
        }
      while(counter <= input);
    }
    
}
