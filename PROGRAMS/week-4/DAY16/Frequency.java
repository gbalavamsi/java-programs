import java.util.*;
class Frequency
  {
    public static void countFrequency(int a[],int n)
    {
      boolean b[]=new boolean[n];
      b[k]=false;
      for(int i=0;i<n;i++)
        {
          if(b[i]==true)
            continue;
          int count=1;
          for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
                b[j]=true;
              count++;
              }
            }
      System.out.println(a[i]+""+count);
        }
    }
    public static void main(String args[])
  {
  int a[]=new int[]{1,2,2,1,1,2,5,2};
  int n=a.length;
  countFrequency(a,n);
  }
      }
   