//Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."
class vehicle
  {
    void startEngine()
    {
      System.out.println("Engine Starting");
    }
  }
class Car extends vehicle
  {
    void startEngine()
    {
      System.out.println("car engine starting");
    }
  }
class Motorcycle extends vehicle
  {
    void startEngine()
    {
      System.out.println("Motorcycle engine starting");
    }
  }
class Vehicle
  {
    public static void main(String args[])
    {
      vehicle v=new vehicle();
      v.startEngine();
      vehicle c=new Car();
      c.startEngine();
      vehicle mc=new Motorcycle();
      mc.startEngine();
    }
  }