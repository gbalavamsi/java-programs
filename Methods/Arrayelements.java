//without returntype without parameters
import java.util.*;
class Arrayelements
  {
  public void printarray()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("the array elements are");
    for(int i=0;i<n;i++)
      {
        System.out.println(a[i]);
      }
  }
  public static void main(String args [])
    {
    Arrayelements pe=new Arrayelements();
    pe.printarray();
    }
      }
    