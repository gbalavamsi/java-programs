import java.util.*;
class Max
  {
    public static void main(String [] args)
    {
      int []a=new int[]{25,11,7,75,56};
      int max=a[0];
      for(int i=0;i<a.length;i++)
        {
          if(a[i]>max)
            max=a[i];
        }
      System.out.println("maximum elements given in the array:"+max);
        }
    }
  