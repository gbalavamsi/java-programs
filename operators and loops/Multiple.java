import java.util.*;
class Multiple
  {
    public static void main(String [] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=s.nextInt();
      for(int i=0;i<=20;i++)
        {
  System.out.println(n+" * "+i+" = "+n*i);
        }
}
}