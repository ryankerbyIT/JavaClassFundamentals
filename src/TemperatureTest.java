import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        // Create a Temperature object with the user's input
        Temperature temp = new Temperature(fahrenheit);

        // Display the temperature in Celsius and Kelvin
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());

        // Close the scanner
        scanner.close();
    }
}
/* 
TemperatureTest Class:
Prompts the user for a Fahrenheit temperature.
Creates a Temperature object with the input.
Displays the temperature in Fahrenheit, Celsius, 
and Kelvin using the respective methods.

*/