package bmi_calculator;
import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {

    // BMI CALCULATOR
    // Ask the user for weight (kg) and height (m)
    // Use arithmetic operator to calculate bmi
    // Formula -> BMI = weight / (height * height)

    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    String choice;

    System.out.println("***** WELCOME TO THE BMI CALCULATOR PROGRAM *****");

    try{
      while(isRunning){
        System.out.print("Enter weight in (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println();

        System.out.println("******************");
        System.out.println("Your bmi is " + bmi);
        System.out.println("******************");

        System.out.println();

        System.out.print("Would you like to calculate bmi again? (Y / N): ");
        choice = scanner.next().toLowerCase();

        if(choice.equals("n")){
          isRunning = false;
        }
        else{
          continue;
        }
      }
    }
    catch (Exception e){
      System.out.println("Something went wrong");
    }

    scanner.close();
  }
}
