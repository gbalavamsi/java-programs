import java.util.Scanner;

public class Grading1
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
       System.out.println(" enter physics marks:");
    int physics=sc.nextInt();
       System.out.println(" enter social marks:");
    int social=sc.nextInt();
       System.out.println(" enter science marks:");
    int science=sc.nextInt();
       System.out.println(" enter maths marks:");
    int maths=sc.nextInt();
       System.out.println(" enter  english marks:");
    int english=sc.nextInt();
      double total=physics+social+science+maths+english;
      double Percentage=(total/500)*100;
      System.out.println("Percentage= "+Percentage);
     int percentage=sc.nextInt();
      if(percentage>=96)
         System.out.println("A");
       else if(percentage>=91 && percentage<95)
         System.out.println("B");
      else if(percentage>=81 && percentage<90)
         System.out.println("C");
      else if(percentage>=71 && percentage<80)
         System.out.println("D");
      else if(percentage>=60 && percentage<70)
         System.out.println("E");
          else
         System.out.println("F");
   }
}