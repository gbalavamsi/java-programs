import java.util.*;
class Student1
  {
    String name;
    int id;
    String grade;
    Student1(String n,int r,String g)
    {
      name=n;
      id=r;
      grade=g;
    }
    public void display()
    {
      System.out.println("the student name is"+name);
      System.out.println("the student id is"+id);
      System.out.println("grade is"+grade);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of student records");
      int count=sc.nextInt();
      Student1 s[]=new Student1[count];
      for(int i=0;i<s.length;i++)
        {
          System.out.println("enter the name of the student");
          String n=sc.next();
          System.out.println("enter the studnt id");
          int r=sc.nextInt();
          System.out.println("enter student grade");
          String g=sc.next();
          s[i]=new Student1(n,r,g);
        }
      for(int i=0;i<s.length;i++)
        {
          s[i].display();
        }
    }
    }
  