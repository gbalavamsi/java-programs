import java.util.Scanner;
class FirstLast
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("The first occurance of character in a string is:");
      System.out.println(str.indexOf('a'));
        }
    }