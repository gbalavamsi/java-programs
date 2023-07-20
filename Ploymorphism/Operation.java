/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases*/
class operation
  {
    void display(int a,int b)
    {
      System.out.println("sum of two numbers is"+(a+b));
    }

void display(int x,float y)
  {
  System.out.println("Sub of two numbers is"+(x-y));
  }

void display(double a,int b)
  {
  System.out.println("mul of two number is"+(a*b));
  }
}

class Operation
  {
public static void main(String [] args)
  {
  operation o=new operation();
  o.display(10,20);
  o.display(20,10);
  o.display(10.00,20);
  }
}