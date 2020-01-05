
public class SelectionSorter
{
    private int[]a;
    public SelectionSorter(int[] arr)
    {
        a = arr;
    }
    
    private void swap(int i, int j)
    {
        int temp = a[i]; //temporary variable to hold a[i] value
        a[i] = a[j]; //swapping the i and j values
        a[j] = temp; //assigning index to j to temporary value
    }
    
    public void selectionSort()
    {
        for (int i = 0; i < a.length; i ++)
        {
           int MP = minPosition(i);
           swap(MP, i);
        }
    }
    
    private int minPosition(int from)
    {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++)
        
            if (a[i] < a[minPos])
            minPos = i;
            return minPos;
        
    }
}
