//with returntype with parameters
import java.util.*;
class Sumofarray
  {
    public int sum(int n)
    {
      int sum=0;
      for(int i=0;i<=n;i++)
        {
          sum=sum+i;
        }
      return sum;
    }
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      Sumofarray s=new Sumofarray();
      System.out.println("enter a number");
      int n=sc.nextInt();
      int result=s.sum(n);
      System.out.println("the sum of numbers is"+result);
    }
  }