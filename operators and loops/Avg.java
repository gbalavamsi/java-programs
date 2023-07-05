import java.util.*;
class Avg
  {
    public static void main(String [] args)
    {
      int i,number=0,sum=0;
      double avg;
      {
        System.out.println("Enter the number");
      }
      for(i=0;i<5;i++)
        {
          Scanner sc=new Scanner(System.in);
          number=sc.nextInt();
          sum+=number;
        }
            avg=sum/5;
      System.out.println("sum of number: " +sum);
      System.out.println("Avg is:" +avg);
        
    }
  }