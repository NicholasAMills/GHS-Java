import java.util.*;
import java.io.*;
public class ModFib
{

  public static int modFibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return modFibonacci(n - 1) + modFibonacci(n - 2);
}
}

