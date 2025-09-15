package number_guessing_game;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
  public static void main(String[] args) {

    // NUMBER GUESSING GAME
    // Computer picks a random number (1 - 10)
    // User keeps guessing until correct
    // After each guess, give users hints
    // Count number of attempts

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int attempts = 0;
    boolean isRunning = true;
    int computerPick = random.nextInt(1, 100 + 1);

    while(isRunning){
      System.out.println(computerPick);
      System.out.print("Guess number from (1 - 100): ");
      int userGuess = scanner.nextInt();

      if(userGuess == computerPick){
        System.out.println("Correct " + "The number was " + computerPick);
        System.out.println(attempts);
        isRunning = false;
      }
      else if(userGuess < computerPick){
        System.out.println("Too low\nTry a higher number");
        attempts ++;
        System.out.println();
      }
      else {
        System.out.println("Too High\nTry a lower number");
        attempts ++;
        System.out.println();
      }
    }
  }
}