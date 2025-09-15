package shopping_cart;
import java.util.Scanner;

public class ShoppingCart {
  public static void main(String[] args) {

    // SHOPPING CART PROGRAM
    // This project asks what the user wants, amount , currency, price
    // And then calculates the total price

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter item to purchase: ");
    String item = scanner.next();

    System.out.print("Enter the amount to purchase: ");
    int amount = scanner.nextInt();

    System.out.print("Enter currency: ");
    char currency = scanner.next().charAt(0);


    System.out.print("Enter the price per item: ");
    int price = scanner.nextInt();

    int total = amount * price;

    System.out.println("You bought " + amount + " " + item + " and your total is " + currency + total);

    scanner.close();
  }
}
