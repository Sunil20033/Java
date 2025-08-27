package corejava;
public class runbank {
  
  public static void main(String[] args) {
    Bank hdfc = new Bank();
    hdfc.greetcustomer();
    hdfc.depositamount(500);
    System.out.println("your current balance:"+hdfc.Getcurentbalce());

    hdfc.withdrawamount(200);
    System.out.println("your current balance:"+hdfc.Getcurentbalce());
  }
}
