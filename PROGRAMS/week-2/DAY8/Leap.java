import java.util.Scanner;
class Leap
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      System.out.println("enter a value");
        int num=s.nextInt();
      if(num%4==0)
        
      {
        System.out.println("it is a leap year");
      }
      else
      {
        System.out.println("it is not a leap year");
      }
    }
  }
  
