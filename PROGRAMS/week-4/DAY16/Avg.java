import java.util.Scanner;
class Avg
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=s.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
      int sum=0;
      double avg=0;
      for(int i=0;i<a.length;i++)
        {
          a[i]=s.nextInt();
          sum=sum+a[i];
          avg=sum/size;
        }
      System.out.println("avg of an array"+ avg);
    }
  }