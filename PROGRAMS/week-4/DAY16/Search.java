import java.util.*;
class Search
  {
    public static void Search(int a[],int size,int value)
    {
      for(int i=0;i<size;i++)
        {
          if(a[i]==value)
          {
            System.out.println("elements found at position"+i);
          }
          else
            System.out.println("not found");
          break;
        }
    }
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elemens");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the element you want to search");
      int value=sc.nextInt();
      Search(a,size,value);
    }
  }