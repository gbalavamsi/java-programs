//without return type with parameters
import java.util.*;
class Maximum
  {
    public void  arrayelements(int a[],int size[])
    {
      System.out.println("enter in array are");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
    public void Maximum(int a[],int size[])
    {
      System.out.println("Maximum elements are in are");
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
              {
            System.out.println(a[i]);
              }
        }
    }
    public static void main(String [] args)
    {
      Maximum m=new Maximum();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elements in the array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=1;i<size;i++)
        {
          if(max<a[i])
            max=a[i];
        }
      m.arrayelemnts(a,size);
      m.Maximum(a,size);
        }
    }
  