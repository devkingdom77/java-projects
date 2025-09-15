package scientific_calculator;

import java.util.Scanner;

public class ScientificCalculator {
  public static void main(String[] args) {

    // SCIENTIFIC CALCULATOR
    // Menu driven program
    // Implement -> addition, subtraction, multiplication, division
    // Add some Math methods

    option();

  }
  public static void addition() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number 1: ");
      int num1 = scanner.nextInt();

      System.out.print("Enter number 2: ");
      int num2 = scanner.nextInt();

      int result = num1 + num2;

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void subtraction() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number 1: ");
      int num1 = scanner.nextInt();

      System.out.print("Enter number 2: ");
      int num2 = scanner.nextInt();

      int result = num1 - num2;

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void division() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number 1: ");
      double num1 = scanner.nextDouble();

      System.out.print("Enter number 2: ");
      double num2 = scanner.nextDouble();

      double result = num1 / num2;

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void multiplication() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number 1: ");
      double num1 = scanner.nextInt();

      System.out.print("Enter number 2: ");
      double num2 = scanner.nextInt();

      double result = num1 / num2;

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void root() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number to find square root: ");
      double number = scanner.nextDouble();

      double result = Math.sqrt(number);

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void exponent() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter number to raise to the power: ");
      double number = scanner.nextDouble();

      System.out.print("Enter the exponent number: ");
      double exp = scanner.nextDouble();

      double result = Math.pow(number, exp);

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void abs() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter in a negative number: ");
      double number = scanner.nextDouble();

      double result = Math.abs(number);

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void max() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter num1: ");
      double num1 = scanner.nextDouble();

      System.out.print("Enter num2: ");
      double num2 = scanner.nextDouble();

      double result = Math.max(num1, num2);

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void min() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter num1: ");
      double num1 = scanner.nextDouble();

      System.out.print("Enter num2: ");
      double num2 = scanner.nextDouble();

      double result = Math.min(num1, num2);

      System.out.println();

      System.out.println("***********************");
      System.out.println("The result is " + result);
      System.out.println("***********************");
    } catch (Exception e) {
      System.out.println();
      System.out.println("InputMismatch error\nTry again");
      System.out.println();
    }
  }

  public static void option(){
    System.out.println("***** THIS IS A SCIENTIFIC CALCULATOR *****");

    Scanner scanner = new Scanner(System.in);

    boolean isRunning = true;

    while(isRunning){
      select();

      System.out.print("Select from the options the operator you want to calculate (1 - 10): ");
      int operatorChoice = scanner.nextInt();

      if(operatorChoice == 1){
        addition();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 2){
        subtraction();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 3){
        division();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 4){
        multiplication();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 5){
        root();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 6){
        exponent();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 7){
        abs();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 8){
        max();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 9){
        min();

        System.out.println();

        System.out.print("Would you like to play again? (Y / N): ");
        String playChoice = scanner.next().toLowerCase();

        if(playChoice.equals("n")){
          isRunning = false;
        }
        else if(playChoice.equals("y")){
          System.out.println("Good!");
        }
        else{
          System.out.println("Invalid response");
        }
      }
      else if(operatorChoice == 10){
        isRunning = false;
        System.out.println("You have exited the program");
      }
      else{
        System.out.println();
        System.out.println("Invalid operator");
        System.out.println();

        scanner.close();
      }
    }
  }
  public static void select(){
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Division");
    System.out.println("4. Multiplication");
    System.out.println("5. root");
    System.out.println("6. Exponent");
    System.out.println("7. abs");
    System.out.println("8. max");
    System.out.println("9. min");
    System.out.println("10: Exit");
  }
}