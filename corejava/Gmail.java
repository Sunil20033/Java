package corejava;
import java.util.Scanner;

public class Gmail {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // lenght() - Gmail minimum Characters for Username
    System.out.println("enter user name:");
    String Username = sc.next();
    if(Username.length()>=6){
      System.out.println("contineu with Password");
    }else{
      System.out.println("Username should have minimum of 6 Char");
    }


    //charAt() - Gender Check M/F
    System.out.println("Enter your Gender:");
    String gender = sc.next();
    if(gender.charAt(0) == 'M' || gender.charAt(0) == 'm'){
      System.out.println("MAlE");
    }else if(gender.charAt(0) == 'f' || gender.charAt(0) == 'F'){
      System.out.println("Female");
    }else{
      System.out.println("Invalid input");
    }


    //Convert To LOWERCAse
    String formattedUserName = Username.toLowerCase();
    System.out.println("given UserANme:"+Username);
    System.out.println("FormattedUserName"+formattedUserName);

    
    //reset PAssword Functionality,where both passwords should amtch
    System.out.println("Enter new Password:");
    String Password  = sc.next();
    System.out.println("Renter the Password");
    String newPassword = sc.next();
    if(Password.equals(newPassword)){
      System.out.println("PAssword created Succesfully");
    }else{
      System.out.println("Both PAsswords shoould match");
    }


    //Pan Functionality
    System.out.println("Enter ur Pan to Update:");
    String Pan = sc.next();
    System.out.println("Updated Succefully: "+Pan.toUpperCase());

    //proper Email Formate
    System.out.println("Enter ur Email");
    String Email = sc.next();
    if(Email.contains("@")){
      System.out.println("VAlid Email");
    }else{
      System.out.println("Invalid EMail");
    }
    //ends with @gmail.com
    System.out.println("enetr another Email");
    String newEmail = sc.next();
    if(newEmail.endsWith("@gmail.com")){
      System.out.println("ITS VALid BRO.....");
    }else {
      System.out.println("Invalid BRO...........");
    }
    //Remove unneccesory space
    System.out.println("origina Email:"+Email);
    System.out.println("Formatted Email:"+Email.trim());

    //Validate MobileNumber & Redirect to approprite Country
    System.out.println("Enter ur Mobile number");
    String mobilenum = sc.next();
    if(mobilenum.startsWith("+91")){
      System.out.println("Calling to INDIA");
    }else if(mobilenum.startsWith("+11")){
      System.out.println("Calling to USA");
    }else{
      System.out.println("Invalid Mobile NUMBER");
    }


    //Substring
    String s1 = new String("Hello JAva");
    System.out.println(s1.substring(4 , 7));
    //Shirt-type-XL 
    System.out.println("enter ur Product ID to Extract INFO ");
    String Product = sc.next();
    if(Product.indexOf("-")==-1){
      System.out.println("Invalid Product Id");
    }else{
      System.out.println("Dress Type:"+Product.substring(0, 5));
      System.out.println("model type:"+Product.substring(0, 5));
    }

  }
}
