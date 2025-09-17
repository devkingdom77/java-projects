package leap_year_checker;
import java.util.Scanner;

public class LeapYearChecker {
  public static void main(String[] args) {

    // LEAP YEAR CHECKER
    // Ask the user for a year
    // if divisible by 4 -> possible leap year
    // if divisible by 100 -> now a leap year unless divisible ny 400
    // Output whether it is a leap year or not

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    if(year % 4 == 0){
      if(year % 100 == 0){
        if(year % 400 == 0){
          System.out.println("A leap year!");
        }
      }
      else{
        System.out.println("A leap year!");
      }
    }
    else{
      System.out.println("Not a leap year!");
    }
  }
}
