class c
  {
    void disp()
    {
      System.out.println("c");
    }
  }
class A extends c
  {
  void disp()
    {
    System.out.println("A");
    }
  }
class B extends c
  {
    void disp()
    {
      System.out.println("B");
    }
  }
class Hybrid
  {
  public static void main(String [] args)
    {
      B obj=new B();
      obj.disp();
      
    }
  }