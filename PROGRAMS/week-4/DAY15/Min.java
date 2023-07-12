import java.util.*;
class Min
  {
    public static void minimum(int a[],int size)
    {
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("The minimum elements in the given array is"+min);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Entr the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
       minimum(a,size);
    }
  }