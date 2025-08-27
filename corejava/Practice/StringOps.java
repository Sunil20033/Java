import java.util.Scanner;

public class StringOps {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Formated User Name
    System.out.println("Enter Your Name : ");
    String name = sc.next();
    String formatedName = name.toUpperCase();
    System.out.println("Given Name:"+name);
    System.out.println("Formated Name: "+formatedName);
    if(name.length() <= 2){
      System.out.println(name +" -->" +"This is very short name please Give a VAlid name ");
    }


    //Equals
    System.out.println("Enter Your Password");
    String Password = sc.next();
    System.out.println("ReEnter Your Password");
    String newPassword = sc.next();
    if(Password.equals(newPassword)){
      System.out.println("Password Created Succesfully");
    }else{
      System.out.println("Both Passwords Should Match");
    }


    //Email Formate
    System.out.println("Enter your Email:");
    String email = sc.next();
    if(email.endsWith("@gmail.com")){
      System.out.println("you Entered a Valid Email");
    }else{
      System.out.println("invalid Email , Email  should End With @gmail.com ");
    }

    //Validate Mobile Number
    System.out.println("Enter your mobile numbet:");
    String Pnumber = sc.next();
    if(Pnumber.startsWith("+91")){
      System.out.println("Calling TO Indian Num ");
    }else if(Pnumber.startsWith("+1")){
      System.out.println("Calling An USA Num");
    }else{
      System.out.println("We Don't Know This Country");
    }

    //
  }
}
