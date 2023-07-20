class Shape
  {
    int length=12,breadth=15;
    int side=15;
    void area()
      {
System.out.println("Different shapes having different sides");
    }
  }
class Square extends Shape 
{
  void area()
  {
    System.out.println("Area of square"+(side*side));
  }
}
class  Rectangle extends Shape
  {
  void area()
    {
    System.out.println("Area of rectangle"+(length+breadth));
    }
  }
class Methodoverridding
  {
    public static void main(String [] args)
    {
     Shape s=new Shape();
      s.area();
     Shape square=new Square();
      square.area();
      Shape rectangle=new Rectangle();
      rectangle.area();
    }
  }