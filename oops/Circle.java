import java.util.*;
class Circle
  {
    double radius;
    Circle(double r)
    {
      radius=r;
    }
    public void display()
    {
      System.out.println("the radius of the circle is"+radius);
      System.out.println("the area of the circle is"+(2*3.14*radius));
    }
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of radius of the circle");
      int count=sc.nextInt();
      Circle c[]=new Circle[count];
      for(int i=0;i<c.length;i++)
        {
          System.out.println("enter"+(i+1)+"circle radius");
          System.out.println("enter the radius of the circle");
          double r=sc.nextDouble();
          c[i]=new Circle(r);
        }
      for(int i=0;i<c.length;i++)
        {
          c[i].display();
        }
    }
      
    }
  