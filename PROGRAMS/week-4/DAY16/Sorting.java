import java.util.*;
class Sorting
  {
    public static void sorting(int a[],int size)
    {
      int i,j,temp=0;
      for(i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
            {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
    }
    System.out.println("after sorting");
for(i=0;i<size;i++)
  {
    System.out.println(a[i]+"");
  }
}
public static void main(String args[])
                        {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of the array");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("enter the array elements");
  for(int i=0;i<size;i++)
    {
    a[i]=sc.nextInt();
  }
sorting(a,size);
}
}