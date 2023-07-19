//single inheritance
class Animal
  {
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Animal
{
  void brack()
  {
    System.out.println("bracking");
  }
}
  class Single
    {
      public static void main(String args[])
      {
      Dog d=new Dog();
        d.brack();
        d.eat();
    }
    }
