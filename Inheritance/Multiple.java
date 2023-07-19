class A
  {
    void message()
    {
      System.out.println("hello");
    }
  }
class B
  {
    void message()
    {
      System.out.println("hi");
    }
  }
class c extends A B
  {
    public static void main(String [] args)
    {
      c obj=new c();
      obj.message();
    }
  }