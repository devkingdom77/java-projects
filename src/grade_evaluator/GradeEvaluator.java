package grade_evaluator;
import java.util.Scanner;

public class GradeEvaluator {
  public static void main(String[] args) {

    // GRADE EVALUATOR
    // Ask the user to input a score (0 - 100)
    // Use if-statements to assign grades

    // Grade system
    // 90 - 100 -> A
    // 80 - 89 -> B
    // 70 - 79 -> C
    // 60 - 69 -> D
    // 59 -> F

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your grade (0 - 100): ");
    double grade = scanner.nextDouble();

    if(grade > 100){
      System.out.println("Grade cant be greater than 100");
    }
    else if(grade < 0){
      System.out.println("Grade cant be less than 0");
    }
    else if(grade >= 90){
      System.out.println("A");
    }
    else if(grade >= 80 && grade < 89){
      System.out.println("B");
    }
    else if(grade >= 70 && grade < 79){
      System.out.println("C");
    }
    else if(grade >= 60 && grade < 69){
      System.out.println("D");
    }
    else if(grade < 60){
      System.out.println("F");
    }
    else{
      System.out.println("Invalid grade input");
    }

    scanner.close();
  }
}
