import java.util.*;
class Operator
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Choose an operator: +, -, *, or /");
      char symbol=sc.next().charAt(0);
      if(symbol=='+')
      {
        System.out.println("enter the value a:");
        int a=sc.nextInt();
        System.out.println("enter the value b:");
        int b=sc.nextInt();
        int res=(a+b);
        System.out.println("the result is addition of:"+res);
      }
      else if(symbol=='-')
      {
        System.out.println("enter the value a:");
        int a=sc.nextInt();
        System.out.println("enter the value b:");
        int b=sc.nextInt();
        int res=(a-b);
        System.out.println("the result is subtraction of:"+res);
      }
      else if(symbol=='/')
      {
        System.out.println("enter the value a:");
        int a=sc.nextInt();
        System.out.println("enter the value b:");
        int b=sc.nextInt();
        int res=(a/b);
        System.out.println("the result is division of:"+res);
      }
      else if(symbol=='*')
      {
        System.out.println("enter the value a:");
        int a=sc.nextInt();
        System.out.println("enter the value b:");
        int b=sc.nextInt();
        int res=(a*b);
        System.out.println("the result is multiplication of:"+res);
      }
      else
      {
        System.out.println("entered operator is invalid");
      }
       
    }
  }