package even_or_odd_checker;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOddChecker {
  public static void main(String[] args) {

    // EVEN OR ODD CHECKER
    // Ask the user to input a number
    // Use an if-statement to check if its even or odd

    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    try{
      while(isRunning) {
        System.out.print("Input a number to check if it is even or odd: ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
          System.out.println("EVEN\n");
        }
        else {
          System.out.println("ODD\n");
        }

        System.out.print("Play again? (Y / N): ");
        String choice = scanner.next().toLowerCase();

        if(choice.equals("n")){
          isRunning = false;
          System.out.println("Exited");
        }
      }
    }
    catch (InputMismatchException e){
      System.out.println("Input mismatch");
    }
    scanner.close();
  }
}