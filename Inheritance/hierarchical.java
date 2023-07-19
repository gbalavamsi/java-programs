class Animal
{
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Animal
  {
    void sleep()
    {
      System.out.println("sleeping");
    }
  }
class cat extends Animal
  {
    void run()
    {
      System.out.println("running");
    }
  }
class hierarchical
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      cat c=new cat();
      d.sleep();
      c.run();
    }
  }