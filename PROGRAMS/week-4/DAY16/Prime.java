import java.util.*;
class Prime
  {
    public static void Prime(int a[],int size)
    {
      System.out.println("prime numbers are");
      for(int i=0;i<size;i++)
        {
          int count=0;
          for(int j=1;j<=size;j++)
            {
              if(a[i]%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elemnets");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      Prime(a,size);
    }
  }