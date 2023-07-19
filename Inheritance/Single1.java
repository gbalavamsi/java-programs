/* Assignment 1: Single Inheritance

Create a superclass called "Animal" with the following attributes:
String name
int age
String breed
  */
class Animal
  {
  String name;
    int age;
    String colour;
    void show()
    {
      System.out.println("showing");
    }
  }
class Dog extends Animal
  {
    void show()
    {
      System.out.println("dog name is"+name+"age is"+age+"colour is"+colour);
    }
  }
class Single1
  {
    public static void main(String [] args)
    {
      Dog d=new Dog();
      d.name="bull dog";
      d.age=10;
      d.colour="black";
      d.show();
      
    }
  }