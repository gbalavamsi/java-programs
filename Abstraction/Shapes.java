abstract class Shape
  {
    abstract void get_Area();
    abstract void get_perimeter();
  }
class Rectangle extends Shape
{
  static int len=10;
  static int bre=5;
  public void get_area()
  {
    System.out.println("area of a rectangle is"+len*bre);
  }
  public void get_Perimeter()
  {
    System.out.println("Perimeter of a rectangle is"+2*(len*bre));
  }
}
class Circle extends Shape{
  static int radius=10;
  public void get_Area()
  {
    System.out.println("area of a circle is"+(3.14*radius*radius));
  }
}
class Shapes
  {
    public static void main(String [] args)
    {
      Rectangle r=new Rectangle();
      Circle c=new Circle();
      r.get_Area();
      r.get_perimeter();
      c.get_Area();
      c.get_Perimeter();
      
    }
  }