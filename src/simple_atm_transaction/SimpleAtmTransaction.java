package simple_atm_transaction;
import java.util.Scanner;

public class SimpleAtmTransaction {
  public static void main(String[] args) {

    // SIMPLE ATM TRANSACTION VALIDATOR
    // Ask user for -> Pin and Transaction amount
    // Check if pin is correct
    // Inside check if balance >= transaction -> then allow withdrawal else show error.
    // Print success or failed messages based on conditions

    Scanner scanner = new Scanner(System.in);

    // YOUR PIN
    int pin = 1234;

    System.out.print("Enter in your PIN (4 digits): ");
    int verifyPin = scanner.nextInt();

    System.out.print("Enter in transaction amount ($): : ");
    double amount = scanner.nextDouble();

    // AVAILABLE BALANCE
    double balance = 2000;

    if(pin == verifyPin){
      if(amount < 0){
        System.out.println("Amount cant be less than zero");
      }
      else if(balance >= amount){
        System.out.println("Transaction of " + "$" + amount + " was Successful" );
      }
      else{
        System.out.println("Insufficient Funds");
      }
    }
    else{
      System.out.println("Incorrect Pin");
    }
  }
}