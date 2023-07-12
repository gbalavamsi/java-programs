import java.util.*;
class Insert
  {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]={2,4,6,9,8};
      int b[]=new int[a.length+1];
      System.out.println("Enter the value to insert");
      int value=sc.nextInt();
      System.out.println("enter the index postion");
      int pos=sc.nextInt();
      for(int i=0;i<b.length;i++)
          {
            if(i==pos)
            {
              b[i]=value;
            }
            else if(i>pos)
            {
            b[i]=a[i-1];
          }
           else
    {
      b[i]=a[i];
    }
        }
System.out.println("the array elements are");
for(int i=0;i<b.length;i++)
  System.out.print(b[i]+"");
    }
    
  }