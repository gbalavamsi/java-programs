/*Assignment 1: Shape Interface Create an interface called Shape with the following methods:

calculateArea(): Abstract method that calculates and returns the area of the shape.
calculatePerimeter(): Abstract method that calculates and returns the perimeter of the shape.
getDescription(): Abstract method that returns a String describing the shape.

Now, create classes Circle, Rectangle, and Triangle, implementing the Shape interface. Write appropriate code to calculate the area and perimeter for each shape and provide a description.

Assignment 2: Animal Interface Create an interface called Animal with the following methods:

sound(): Abstract method that returns a String representing the sound the animal makes.
eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.

Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habits.*/
class Customer {
  private long accountno;
  private float balance;

 

  public void setAccountno(long accountno) {
    this.accountno = accountno;
  }

 

  public long getAccountno() {
    return this.accountno;
  }

 

  public void setBalance(float balance) {
    this.balance = balance;
  }

 

  public float getBalance() {
    return this.balance;
  }
}

 

class BankOperation {
  // Customer customer = new Customer();

 

    void deposit(int amount, Customer customer) {

 

    float bal = customer.getBalance();
    System.out.println("the amount after deposited" + bal);
  }

 

  void showDetails(Customer customer) {
    System.out.println("balance is " + customer.getBalance());
    System.out.println("account no is" + customer.getAccountno());
  }
}
class Transaction
  {
    public static void main(String args[]) {
    Customer customer1 = new Customer();
    customer1.setAccountno(123489012345L);
    customer1.setBalance(12000.0f);
    BankOperation transaction = new BankOperation();
    transaction.showDetails(customer1);
    transaction.deposit(2000, customer1);

 

  }

 

  }

has context menu