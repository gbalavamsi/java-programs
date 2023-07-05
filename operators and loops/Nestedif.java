class Nestedif
  {
    public static void main(String [] args)
    {
      String country="India";
        int age=25;          
      
    if(age>=18){  
      System.out.println("you are eligible to vote");
        if(country=="India"){    
            System.out.println("you are from India");    
        } else{  
            System.out.println("you not form India");    
        }  
    } else{  
      System.out.println("you are not eligible to vote");  
    }  
}  } 