
public class ColSum
{
    public static void main(String args[])
    {
  int[][] data = { {3, 2, 5, 0, 0, 0},
                   {1, 4, 4, 8, 13, 0},
                   {9, 1, 0, 2, 0, 0},
                   {0, 2, 6, 3, -1, -8} };
    int total = 0;
    // declare the sum
    
    
    // compute the sums for each row
    for ( int col=0; col < 6; col++)
    {
      // initialize the sum
      if (col == 1 || col == 2 || col == 3 || col == 4 || col == 5)
      total = 0;
      // compute the sum for this row
      for ( int row=0; row < data.length; row++) 
      {
        total += data[row][col];
      }
      System.out.println(total);
      // write the sum for this row
      //System.out.println(  );
    }
  }
}
