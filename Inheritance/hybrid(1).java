/*Assignment 4: Hybrid Inheritance

Create a superclass called "Person" with the following attributes:
String name
int age
double salary
String major
double gpa
String company
  */
class Person
  {
    String name;
    int age;
    double salary;
    String company;
    void detail()
    {
      System.out.println("details");
    }
  }
class Employee1 extends Person
  {
    void detail()
    {
      System.out.println("Employee1 name is"+name+"Employee1 age is"+age+"Employee1 salary is"+salary+"Employee1 company is"+company);
    }
  }
class Employee2 extends Person
  {
    void detail()
    {
      System.out.println("Employee2 name is"+name+"Employee2 age is"+age+"Employee2 salary is"+salary+"Employee2 company is"+company);
    }
  }
class hybrid
  {
    public static void main(String [] args)
    {
      Employee2 obj1=new Employee2();
      obj1.name="vamsi";
      obj1.age=23;
      obj1.salary=25000.00;
      obj1.company="bitlabs";
      Employee1 obj2=new Employee1();
      obj2.name="janu";
      obj2.age=24;
      obj2.salary=21000.00;
      obj2.company="bitlabs";
        
      obj1.detail();
      obj2.detail();
    }
  }