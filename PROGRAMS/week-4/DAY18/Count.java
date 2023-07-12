class Digit
  {
    public static void main(String args[])
    {
      String str="Bitlabs@123";
      int digit=0;
      int s=0;
      int a=0;
      for(int i=0;i<str.length();i++)
        {
        char ch=str.charAt(i);
       
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
      {
        a++;
      }
       
      else if(ch>='0' && ch<='9')
      {
        digit++;
      }
       else
        s++;
      }
    
       System.out.println("alphabets are: "+a);
       System.out.println("digits are: "+digit);
       System.out.println("specialcharacter are: "+s);
       }
  }