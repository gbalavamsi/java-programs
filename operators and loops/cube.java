import java.util.*;
public class cube
  {
    public static void main(String[] args)
    {
      int i,number;
      System.out.println("Enter the the number");
      Scanner sc=new Scanner(System.in);
      number=sc.nextInt();
      for(i=1;i<=number;i++)
        {
          System.out.println("cube of "+i+" is : "+(i*i*i));
        }
    }  }
