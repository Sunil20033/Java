package corejava;
public class calculator {

  //metod without retur type and parameter
  public void greetCalculator(){
    System.out.println("Hello,there i can do calculator");
  }

  //Metod with return type and a paarameater
  public String numbertype(int num){
    if (num>0){
      return "positive number";
    }
    else{
      return"negative number";
    }
  } 
  
  //method with return type multiple parameters
  public int addnumbers(int num1,int num2){
    return num1+num2;
  }

  public static void main(String[] args) {
    
  calculator calObj = new calculator();
  calObj.greetCalculator();
  System.out.println(calObj.numbertype(-10));
   System.out.println(calObj.addnumbers(230, 20));
  } 
}
