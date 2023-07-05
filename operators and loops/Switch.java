class Switch
  {
    public static void main(String[] args)
    {
      String monthString="January";
      switch(month)
        {
          case 1:monthString= "january"; 
            break;
            case 2:monthString="February";
            break;
            case 3:monthString="March";
            break;
            case 4:monthString= "April" ;
            break;
            case 5:monthString= "May"; 
            break;
            case 6:monthString= "june";
            break;
            case 7:monthString= "july"; 
            break;
            case 8:monthString= "Aug";
            break;
            case 9:monthString= "sep";
            break;
            case 10:monthString= "oct";
            break;
            case 11:monthString="Nov";
            break;
            case 12:monthString="Dec";
            break;
          default:System.out.println("Invalid Month:");
        }
    }
  }