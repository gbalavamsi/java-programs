//Methodoverloading
class Shape
  {
void area()
    {
      System.out.println("display area of all shapes");
    }
  
void  area(int base,int height)
  {
  System.out.println("Area of the trainagle"+(1/2*base*height));
  }
void area(float side)
  {
  System.out.println("Area of square"+(side*side));
  }
void area(float length,float breadth)
  {
  System.out.println("Area of rectangle"+(length+breadth));
  }
  }
class Methodoverloading
  {
    public static void main(String args[])
    {
      Shape m=new Shape();
      m.area();
      m.area(10);
      m.area(30.0f);
      m.area(30.5f,20.5f);
    }
  }
  