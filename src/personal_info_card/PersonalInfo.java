package personal_info_card;
import java.util.Scanner;

public class PersonalInfo{
  public static void main(String[] args){

    // PERSONAL INFO CARD
    // This project asks user for their name, age, and hobby
    // Stores them in a variable and then print a formattable profile card

    Scanner scanner = new Scanner(System.in);



    System.out.print("Enter your name: ");
    String name = scanner.next();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("What is your hobby: ");
    String hobby = scanner.next();


    System.out.println();

    System.out.println("Hello my name is " + name);
    System.out.println("I am " + age + " years old");
    System.out.println("I love " + hobby + " a lot");

    scanner.close();
  }
}