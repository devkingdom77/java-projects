package reciept_generator;
import java.util.Scanner;

public class ReceiptGenerator {
  public static void main(String[] args){

    // RECEIPT GENERATOR
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter item: ");
    String item = scanner.next();

    System.out.print("Enter item price($): ");
    double price = scanner.nextDouble();

    System.out.print("Enter item quantity: ");
    double quantity = scanner.nextDouble();
    double total1 = quantity * price;

    System.out.println();

    System.out.print("Enter item2: ");
    String item2 = scanner.next();

    System.out.print("Enter item2 price($): ");
    double price2 = scanner.nextDouble();

    System.out.print("Enter item2 quantity: ");
    double quantity2 = scanner.nextDouble();
    double total2 = quantity2 * price2;

    System.out.println("\n");

    System.out.printf("Item: %.5s, Price: %.2f, Quantity: %.2f, Total: %.2f\n", item, price, quantity, total1);
    System.out.printf("Item: %.5s, Price: %.2f, Quantity: %.2f, Total: %.2f", item2, price2, quantity2, total2);
  }
}
