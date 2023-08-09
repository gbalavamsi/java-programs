abstract class Shape
  {
    abstract void calculateArea();
  }
class Rectangel extends Shape{
  public void calculateArea()
  {
    int length=10;
    int breadth=20;
    System.out.println("Area of the Rectangle"+(length*breadth));
  }
}
class Square extends Shape{
  public void calculateArea()
  {
    int side=20;
    System.out.println("Area of the square"+(side*side));
  }
}
class Area
  {
    public static void main(String [] args)
    {
      Rectangle r=new Rectangle();
      Square s=new Square();
      r.calculateArea();
      s.calculateArea();
    }
  }