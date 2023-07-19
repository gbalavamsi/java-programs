import java.util.*;
class Employee
  {
    String name;
    String designation;
    int salary;
    Employee(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println(name+""+designation+""+salary);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number you want to create the list");
      int count=sc.nextInt();
      Employee e[]=new Employee[count];
      for(int i=0;i<e.length;i++)
        {
          System.out.println("enter"+(i+1)+"employee details");
          System.out.println("enter employee name");
          String n=sc.next();
          System.out.println("enter designation");
          String d=sc.next();
        System.out.println("enter the salary");
          int s=sc.nextInt();
          e[i]=new Employee(n,d,s);
        }
      for(int i=0;i<e.length;i++)
        {
          e[i].display();
        }
        }
    }
    