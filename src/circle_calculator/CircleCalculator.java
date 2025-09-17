package circle_calculator;
import java.util.Scanner;

public class CircleCalculator {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {

    // CIRCLE CALCULATOR
    // Asks the user for the radius of a circle
    // Use math.pi and math.pow to calculate (Area and Circumference)
    // Formula -> Area = pi * r²
    // Formula -> Circumference = 2 * pi * r

    /*
    area();
    System.out.println();
    circumference();
     */
    // uncomment to use
  }
  public static void area(){
    System.out.println("***** CALCULATE AREA OF A CIRCLE *****");

    System.out.print("Enter radius: ");
    double radius = scanner.nextInt();

    double area = Math.PI * Math.pow(radius, 2);
    System.out.println(area);
  }
  public static void circumference(){
    System.out.println("***** CIRCUMFERENCE OF A CIRCLE *****");
    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    System.out.println(circumference);
  }
}