/*Assignment 1: Method Overloading

Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
class Strings
  {
    void concatenate(String s,String s1)
    {
      String str=s.concat(s1);
      System.out.println(str);
    }
  void concatenate(String s,String s1,String s2)
    {
      String st=s.concat(s1);
      System.out.println(st.concat(s2));
    }
  }
class Stringhelper
  {
    public static void main(String args[])
    {
      Strings s=new Strings();
      s.concatenate("hi","hello");
      s.concatenate("hello","world");
    }
  }

