package corejava;
public class Bank {

  double currentBalance = 1000;

  public void greetcustomer(){
    System.out.println("welcome to bank");
  }

  public void depositamount(double amount){
    currentBalance += amount;
    System.out.println("amount deposited:"+amount);
  }

  public void withdrawamount(double amount){
    currentBalance -= amount;
     System.out.println("amount withdarw:"+amount);
  }

  public double Getcurentbalce(){
    return currentBalance;
  }
}
