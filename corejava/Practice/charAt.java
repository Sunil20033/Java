import java.util.Scanner;

public class charAt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Gender:");
    String gender = sc.next();
    if(gender.charAt(0) =='m' || gender.charAt(0) =='M'){
      System.out.println("MAle");
    }else if(gender.charAt(0) == 'f'){
      System.out.println("Female");
    }else{
      System.out.println("Invalid gender or u should be a gay");
    }
  }
}
