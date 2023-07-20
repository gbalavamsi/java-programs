/*In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:

add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.

Your task is to write the Calculator class and demonstrate the use of these methods by calling each of them with appropriate arguments and printing the results.*/
class calculator
  {
    void addition(int a,int b)
    {
      int sum=a+b;
      System.out.println("the sum is"+sum);
    }
  void addition(int a,int b,int c)
    {
      int sum=a+b+c;
      System.out.println("the sum is"+sum);
    }
void addition(int a,int b,int c,int d)
    {
      int sum=a+b+c+d;
      System.out.println("the sum is"+sum);
    }
  }
class Calculator
  {
    public static void main(String [] args)
    {
      calculator c=new calculator();
      c.addition(12,24);
      c.addition(23,34,25);
      c.addition(12,25,43);
    }
  }
    