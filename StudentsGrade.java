public class StudentsGrade {
  public static void main(String[] args) {
    int StudentsGradeLevel = 6;
    double BaseTutionFee = 200000;
    float DiscountPercentage = 0.0f;
    boolean AcademicTopper = false;
    
    //Using Conditional Statements
    if(StudentsGradeLevel>=9 && StudentsGradeLevel<=12){
      if(AcademicTopper){
        DiscountPercentage = 20.0f; 
      }
      else{
        DiscountPercentage = 10.0f;
      }
    }
    else if(StudentsGradeLevel>=6 && StudentsGradeLevel<=8){
      DiscountPercentage = 5.0f;
    }
    else if(StudentsGradeLevel<6){
      DiscountPercentage = 0.0f;
    }
    if(StudentsGradeLevel == 10){
      DiscountPercentage += 3.0f;
    }
    else if(StudentsGradeLevel == 12){
      DiscountPercentage += 5.0f;
    }

    Double FinalTutionFee = BaseTutionFee -(BaseTutionFee*DiscountPercentage/100);

    System.out.println("Student's GradeLevel : " + StudentsGradeLevel);
    System.out.println("Base TutionFee: RS" +BaseTutionFee);
    System.out.println("Discount Percentage : " + DiscountPercentage + "%");
    System.out.println("FinalTutionFee:RS" +FinalTutionFee );
   }
}
