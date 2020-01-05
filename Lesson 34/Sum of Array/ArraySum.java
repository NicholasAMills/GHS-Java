import java.io.* ;

class ArraySum
{

  public static void main ( String[] args ) throws IOException
  {
    int data[][] = { {3,2,5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8} };
    int total = 0;
    
    // declare the sum
    
    
    // compute the sum
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        total = total + data[row][col];
      }
     
    }
      
    // write out the sum
    System.out.println(total);

  }
}
