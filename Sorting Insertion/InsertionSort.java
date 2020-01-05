
public class InsertionSort
{
    private int []a;
    public InsertionSort(int[] arr)
    {
        a = arr;
    }

    public void insertionSort()
    {
        for(int j = 1; j < a.length; j++)
        {
            int temp = a[j];
            int pIndex = j;
            while(pIndex > 0 && temp < a[pIndex - 1])
            {
                a[pIndex] = a[pIndex - 1];
                pIndex--;
            }
            a[pIndex] = temp;
        }

    }
}
