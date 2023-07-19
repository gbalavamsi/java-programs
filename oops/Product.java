import java.util.*;
class Product
  {
    String pname;
    int price;
    String quantity;
    Product(String n,int pr,String q)
    {
      pname=n;
      price=pr;
      quantity=q;
    }
    public void display()
    {
      System.out.println(pname+""+price+""+quantity);
    }
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      Product p[]=new Product[2];
      for(int i=0;i<p.length;i++)
        {
          System.out.println("enter the product"+(i+1)+"details");
          System.out.println("enter the product name");
          String n=sc.next();
          System.out.println("enter the product price");
          int pr=sc.nextInt();
          System.out.println("enter the quantity of the product");
          String q=sc.next();
          p[i]=new Product(n,pr,q);
        }
      for(int i=0;i<p.length;i++)
        {
          p[i].display();
        }
    }
    }
  