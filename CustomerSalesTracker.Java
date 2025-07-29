import java.util.Scanner;

public class CustomerSalesTracker{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in)

    System.out.println("Enter ID:");
    int CustomerID = sc.nextInt();

    System.out.println("Enter Name:");
    String CustomerName = sc.next();
    Double TotalPurchases = 0.0;
    int InteractionCount = 0;

    char Validation_Check = 'Y';
    while(Validation_Check=='Y'||Validation_Check=='y'){
      System.out.println("Enter SalesValue:");
      Double SalesValue = sc.nextdouble();
      TotalPurchases += SalesValue;
      InteractionCount++;

      System.out.println("Do you want to continue(y/n):");
      Validation_Check = sc.next().CharAt(0);
    }
    Double AverageSale = TotalPurchases/InteractionCount;
    System.out.println(AverageSale);
  }
}