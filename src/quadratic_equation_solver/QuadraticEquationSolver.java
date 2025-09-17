package quadratic_equation_solver;
import java.util.Scanner;

public class QuadraticEquationSolver {
  public static void main(String[] args){

    // QUADRATIC EQUATION SOLVER
    // Ask user for coefficients a, b, c
    // Then use the quadratic formular
    // Equation -> x = (-b Math.sqrt(b² - 4ac)) / 2a

    Scanner scanner = new Scanner(System.in);
    System.out.println("***** QUADRATIC EQUATION *****");

    System.out.print("Enter coefficient for a: ");
    double a = scanner.nextDouble();

    System.out.print("Enter coefficient for b: ");
    double b = scanner.nextDouble();

    System.out.print("Enter coefficient for c: ");
    double c = scanner.nextDouble();

    double discriminant = Math.pow(b, 2) - 4 * a * c;

    if(discriminant < 0){
      System.out.println("No roots");
    }
    else{
      double result = (-b + Math.sqrt(discriminant)) / (2 * a);
      double result2 = (-b - Math.sqrt(discriminant)) / (2 / a);

      System.out.println("Roots 1 -> " + result);
      System.out.println("Roots 2 -> " + result2);
    }
    scanner.close();
  }
}
