package username_validator;
import java.util.Scanner;

public class UsernameValidator {
  public static void main(String[] args) {

    // USERNAME VALIDATOR
    // Ask the user to enter an email
    // Use string methods to verify if it is valid

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    int length = email.length();
    boolean contain = email.contains("@");

    if(length > 6 && contain) {
      System.out.println("Username valid");
    }
    else if(!contain){
      System.out.println("Username does not contain @");
    }
    else{
      System.out.println("Invalid username");
    }
    scanner.close();
  }
}
