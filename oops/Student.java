class Student
  {
String studentName;
int studentRollno;
static String clgname="kbn";
    public static void main(String args[])
    {
     Student st=new Student();
      st.studentName="priya";
      st.studentRollno=457;
      Student st1=new Student();
      st1.studentName="vamsi";
      st1.studentRollno=123;
      System.out.println(st.studentName+" "+st.studentRollno+" "+clgname);
      System.out.println(st1.studentName+" "+st1.studentRollno+" "+clgname);
    }
  }