/*Assignment 3: Animal Hierarchy

Create an abstract class called "Animal" with the following abstract methods:

speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.

Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.

Write a program to:

Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Animal
  {
    abstract void sound();
  }
class Dog extends Animal{
  public void sound()
  {
    System.out.println("Sound of the dog is"+("bow"));
    System.out.println("movement of dog is"+("run"));
  }
}
class Cat extends Animal
  {
    public void sound()
    {
      System.out.println("Sound of the cat is"+("meow"));
      System.out.println("movement of the Cat is"+("sleeping"));
    }
  }
class Sound
  {
    public static void main(String [] args)
    {
      Dog d=new Dog();
      Cat c=new Cat();
      d.sound();
      c.sound();
      
    }
  }