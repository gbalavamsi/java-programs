//without return type with paraameters
import java.util.*;
class Even
  {
    public void arrayelements(int a[],int size)
  {
    System.out.println("elements in array are");
    for(int i=0;i<size;i++)
      {
        System.out.println(a[i]);
      }
  }
public void Even(int a[],int size)
  {
  System.out.println("even elements in array are");
  for(int i=0;i<size;i++)
    {
      if(a[i]%2==0)
      {
        System.out.println(a[i]);
      }
    }
  }
public static void main(String [] args)
  {
  Even e=new Even();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of the array");
  int size=sc.nextInt();
  int a[]=new int [size];
  System.out.println("enter the elements in the array");
  for(int i=0;i<size;i++)
    {
      a[i]=sc.nextInt();
    }
  e.arrayelements(a,size);
  e.Even(a,size);
  }
      }
  
  