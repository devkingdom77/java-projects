package temperature_converter;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {

    // TEMPERATURE CONVERTER
    // Ask the user to enter a temperature in Celsius or in Fahrenheit
    // Convert it to Fahrenheit or Celsius (vice versa)

    // Formula -> F = (C * 9 / 5) + 32   ------------ C - F
    // Formula -> C = (F - 32) * 5 / 9   ------------ F - C

    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    String choice;


    while(isRunning){
      System.out.println("***** WELCOME TO TEMPERATURE CONVERTER PROGRAM *****");

      System.out.print("Convert to (celsius / fahrenheit): ");
      String temperature = scanner.next().toLowerCase();

      if(temperature.equals("celsius")){
        System.out.print("Enter temperature in fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        System.out.println();

        int celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("****************************************************");
        System.out.println("The temperature is " + celsius + "°C" + " in celsius");
        System.out.println("****************************************************");

        System.out.println();

        System.out.print("Would you like to convert again? (Y / N): ");
        choice = scanner.next().toLowerCase();

        System.out.println();

        if(choice.equals("n")){
          isRunning = false;
          System.out.println("You have exited the program");
        }
        else{
          continue;
        }
      }
      else if(temperature.equals("fahrenheit")){
        System.out.print("Enter the temperature in celsius: ");
        int celsius = scanner.nextInt();

        System.out.println();

        int fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("**********************************************************");
        System.out.println("The temperature is " + fahrenheit + "°F" + " in fahrenheit");
        System.out.println("**********************************************************");

        System.out.println();

        System.out.print("Would you like to convert again? (Y / N): ");
        choice = scanner.next().toLowerCase();

        System.out.println();

        if(choice.equals("n")){
          isRunning = false;
          System.out.println("You have exited the program");
        }
        else{
          continue;
        }
      }
      else{
        System.out.println("Not a temperature!");
      }
    }
  }
}































