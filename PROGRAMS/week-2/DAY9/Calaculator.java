import java.util.Scanner;
class Calaculator
  {
    public static void main(String args[])
    {
       char operator;
    Double number1, number2, result;
Scanner input = new Scanner(System.in);

       System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);
      System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
       result = number1 + number2;
System.out.println(number1 + " + " + number2 + " = " + result);
    }
  }