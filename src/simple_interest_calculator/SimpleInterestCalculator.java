package simple_interest_calculator;
import java.util.Scanner;

public class SimpleInterestCalculator {
  public static void main(String[] args) {

    // SIMPLE INTEREST CALCULATOR
    // This project takes input for principal, rate, time
    // And then use variables to calculate the simple interest
    // Formula -> interest = (principal * rate * time) / 100

    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the principal amount ($): ");
    int principal = scanner.nextInt();

    System.out.print("Input the rate (%): ");
    int rate = scanner.nextInt();

    System.out.print("Input time (years): ");
    int time = scanner.nextInt();

    System.out.println();

    int interest = (principal * rate * time) / 100;
    System.out.println("The simple interest is " + "$" + interest);

    int endBalance = principal + interest;
    System.out.println("The end balance is " + "$" + endBalance);
  }
}
