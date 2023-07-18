//without return type with parameters
import java.util.*;
class Odd
  {
    public void arrayelements(int a[],int size)
    {
      System.out.println("enter elements in array are");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
    public void Odd(int a[],int size)
    {
      System.out.println("odd elements in the array are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String [] args)
    {
      Odd O=new Odd();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elements in the array are");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      O.arrayelements(a,size);
      O.Odd(a,size);
    }
  }