import java.util.Scanner;
class Dim
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=s.nextInt();
      System.out.println("enter column size");
      int column=s.nextInt();
      int arr[][]=new int[row][column];
      System.out.println("enter the elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              arr[i][j]=s.nextInt();
            }
        }
      System.out.println("the elements are");
      for(int i=0;i<row;i++)
        {

          for(int j=0;j<column;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
            
              
            
        }
    }
  }