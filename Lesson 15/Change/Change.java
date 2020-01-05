public class Change
{
    
    int c;
    
    public Change(int a)
    {
         c =  a;
    }
    
    public int Quarters()
    {
       int q = c / 25;
       return q;
       
    }
    
    public int Dimes()
    {
        int d = (c%25) / 10;
        return d;
    }
    
    public int Nickels()
    {
        int n = (c%25 %10) / 5;
        return n;
    }
    
    public int Pennies()
    {
       int p = (c%25%10%5)/1;
        return p;
    }
    
}
