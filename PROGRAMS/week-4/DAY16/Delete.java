import java.util.*;
class Delete
  {
    public static void main(String [] args)
    {
      int[]a=new int[6];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements of the array");
      int size=sc.nextInt();
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
          System.out.println("Bfore the delection");
          for(int i=0;i<size;i++)
            {
              System.out.println(a[i]+"");
            }
          System.out.println("enter the postion where to delete");
          int pos=sc.nextInt();
          for(int i=pos;i<size-1;i++)
            {
              a[i]=a[i+1];
            }
          System.out.println("After the delection");
          for(int i=0;i<size;i++)
            {
              System.out.println(a[i]+"");
            }
        }
    }
