import java.util.Scanner;
class Nested {
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      if(num<=5)
      {
        if(num<3)
        {
          System.out.println("number is lessthan 3");
        }
        if(num==3)
        {
           System.out.println("number is equal to 3"); 
        }
        else
        {
            System.out.println("number is not equal to 3");
        }
      }
      else
      {
        System.out.println("number is greaterthan 3");  
      }
    }
}