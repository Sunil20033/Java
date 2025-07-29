import java.util.Scanner;

public class customersales{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter ID:");
    int CustomerID = sc.nextInt();

    System.out.println("Enter Name:");
    String CustomerName = sc.next();
    Double TotalPurchases = 0.0;
    int InteractionCount = 0;

    char Validation_Check = 'Y';
    while(Validation_Check=='Y'||Validation_Check=='y'){
      System.out.println("Enter SalesValue:");
      Double SalesValue =sc.nextDouble();
      TotalPurchases += SalesValue;
      InteractionCount++;

      System.out.println("Do you want to continue(y/n):");
      Validation_Check = sc.next().charAt(0);
    }
    Double AverageSale = TotalPurchases/InteractionCount;
    // System.out.println(AverageSale);

    String CustomerStatus = "";
    if(TotalPurchases >= 50000){
      CustomerStatus="Platinum";
    }
    else if(TotalPurchases >= 25000){
      CustomerStatus="Gold";
    }
    else if(TotalPurchases >= 10000){
     CustomerStatus="Silver";
    }
    else{
      CustomerStatus = "Bronze";
    }

    String ActiveStatus = InteractionCount<5 ? "interaction count is so bad ":"interaction count is good";

    System.out.println("Customer ID:"+CustomerID);
    System.out.println("Customer Name:"+CustomerName);
    System.out.println("TotaPurchases:"+TotalPurchases);
    System.out.println("Average Sale:"+AverageSale);
    System.out.println("customer Status:"+CustomerStatus);
    System.out.println("Active Status:"+ActiveStatus);

    sc.close();
  }
}