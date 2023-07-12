import java.util.Scanner;
class Right
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]={23,67,44,56,90,12};
      System.out.println("enter the position value how many you want to shift");
      int number=sc.nextInt();
      System.out.println("Befor perfroming right roatation  ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
      System.out.println();
      for(int i=0;i<number;i++) 
        {
      int temp=a[a.length-1];
      for(int j=a.length-1;j>0;j--) 
        {
          a[j]=a[j-1];
        }
      a[0]=temp;
    }
      System.out.println("after perfroming right roatation by" +number+ " position ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }

