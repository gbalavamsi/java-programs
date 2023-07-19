/*
Assignment 2: Multilevel Inheritance

Create a class called "Vehicle" with the following attributes:
String make
String model
int numDoors
boolean isConvertible
  */
class Vehicle
  {
    String make;
    String model;
    int numDoors;
    boolean isConvertible;
    void check()
    {
      System.out.println("checking");
    }
  }
class car extends Vehicle
  {
    void speed()
    {
      System.out.println("car make is"+make+"car model is"+model+"car numDoors are"+numDoors+"car is"+isConvertible);
    }
  }
class bus extends Vehicle
  {
    void Fast()
    {
      System.out.println("bus make is"+make+"bus model is"+model+"bus numDoors are"+numDoors+"bus is"+isConvertible);
    }
  }
class Multilevel1
  {
    public static void main(String [] args)
    {
      bus b=new bus();
      car c=new car();
      c.make="Toyota";
      c.model="inova";
      c.numDoors=4;
      c.speed();
    }

  }