public class Emi1 {
  public static void main(String[] args) {
    int OnroadpriceinDelhi = 2190887;
    int downPayment = 380000;
    Double Bankinterset = 9.50;
    int LoanPeriodYears = 4;

    int LoanAmount = OnroadpriceinDelhi - downPayment;
    double monthlyInterestRate = Bankinterset / 12 / 100;

    int loanMonths = LoanPeriodYears*12;
    int emi = (int) ((LoanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanMonths)) /
    (Math.pow(1 + monthlyInterestRate, loanMonths) - 1));

     int TotalLoanAmount = (int) (emi * loanMonths);

        System.out.println("EMI Calculation");
        System.out.println("On-Road Price: Rs. " + OnroadpriceinDelhi);
        System.out.println("Down Payment: Rs. " + downPayment);
        System.out.println("Loan Amount: Rs. " + LoanAmount);
        System.out.println("Interest Rate (Annual): " + Bankinterset + " %");
        System.out.println("Loan Period: " + LoanPeriodYears + " years");
        System.out.println("Total Loan Amount: Rs. " + TotalLoanAmount);
        System.out.println("Monthly EMI: Rs. " + emi);
    }
  }
  
