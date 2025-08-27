import java.util.Scanner;

public class minimumChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter your NAme:");
    String name = sc.next();
    if (name.length()>=5){
      System.out.println("Valid User Name");
    }else{
      System.out.println("invalid user name");
    }
  }
}
