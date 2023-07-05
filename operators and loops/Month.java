import java.util.*;
class Month
  {
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a month");
      String month=sc.nextLine();
      switch(month)
        {
          case "januvary":
            System.out.println("januvary has 31 days");
            break;
          case "february":
            System.out.println("febrauary has 28 or 29 days");
            break;
          case "march":
            System.out.println("march has 31 days");
            break;
          case "april":
            System.out.println("april has 30 days");
            break;
          case "may":
            System.out.println("may has 31 days");
            break;
          case "june":
            System.out.println("june has 30 days");
            break;
          case "july":
            System.out.println("july has 31 days");
            break;
          case "august":
            System.out.println("august has 31 days");
            break;
          case "september":
            System.out.println("september has 30 days");
            break;
          case "october":
            System.out.println("october has 31 days");
            break;
          case "november":
            System.out.println("november has 30 days");
            break;
          case "december":
            System.out.println("december has 31 days");
            break;
          default:
            System.out.println("please enter a valid month");
            
            
            
        }
        
    }
  }