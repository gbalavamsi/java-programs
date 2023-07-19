class Animal
  {
     void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Animal
  {
   void run()
    {
      System.out.println("running");
    }
  }
class Babydog extends Dog
  {
    void sleep()
    {
      System.out.println("sleeping");
    }
  }
class Multilevel
  {
    public static void main(String [] args)
    {
      Babydog d=new Babydog();
      d.sleep();
      d.run();
      d.eat();
    }
  }