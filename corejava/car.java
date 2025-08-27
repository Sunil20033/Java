package corejava;
import java.util.Scanner;

public class car {

  String Name;
  short age;
  //instance Variables
  // String brand;
  // int year;
  // double price;


  public void shortinfo(){
    System.out.println("age likh badwe:"+age);
  }

   public static void main(String[] args) {
    car obj = new car();
    obj.shortinfo();
    Scanner sc=new Scanner(System.in);

    short age = sc.nextShort();

    // calculator obj1= new calculator();
    if (age >20 ){
      System.out.println( "tera jindagi ke loude lag chuke hai bhaii");
    }
    else{
      System.out.println( "loude phone off kar or padaii me dyan de");
    }
  }
}
