package basic_quiz_app;
import java.util.Scanner;

public class BasicQuizApp {
  public static void main(String[] args) {

    // BASIC QUIZ APP
    // Ask the user 3 - 5 multiple choice questions
    // Take their input as answers
    // Keep score and show the final result at the end
    // Add feedback for right and wrong answers

    Scanner scanner = new Scanner(System.in);
    String answers;
    int score = 0;

    System.out.print("What is the first element in the periodic table (A. Helium, B. Boron, C. Hydrogen, D. Silver)?: ");
    answers = scanner.next().toLowerCase();

    if(answers.equals("c")){
      System.out.println("CORRECT!");
      System.out.println("The correct answer is Hydrogen");
      score++;
    }
    else{
      System.out.println("WRONG!");
      System.out.println("The correct answer is Hydrogen");
    }

    System.out.println();

    System.out.print("Who is the first president of USA (A. D.Trump, B. G.Washington, C. J.Biden, D. G.Bush)?: ");
    answers = scanner.next().toLowerCase();

    if(answers.equals("b")){
      System.out.println("CORRECT!");
      System.out.println("The correct answer is G.Washington");
      score++;
    }
    else{
      System.out.println("WRONG!");
      System.out.println("The correct answer is G.Washington");
    }

    System.out.println();

    System.out.print("What number was the APOLLO mission that successfully put a man on the moon for the first time in human history(A. Apollo 11, B. Apollo 12, C. Apollo 13, D. Apollo 14)?: ");
    answers = scanner.next().toLowerCase();

    if(answers.equals("a")){
      System.out.println("CORRECT!");
      System.out.println("The correct answer is Apollo 11");
      score++;
    }
    else{
      System.out.println("WRONG!");
      System.out.println("The correct answer is Apollo 11");
    }
    System.out.println("Your total score is " + score);
  }
}
