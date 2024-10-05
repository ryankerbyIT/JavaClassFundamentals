import java.util.Scanner;

public class RouletteWheel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a pocket number
        System.out.print("Enter a pocket number (0 to 36): ");
        int pocketNumber = scanner.nextInt();

        // Validate the input
        if (pocketNumber < 0 || pocketNumber > 36) {
            System.out.println("Error: Invalid pocket number. Please enter a number between 0 and 36.");
        } else {
            // Create a RoulettePocket object
            RoulettePocket pocket = new RoulettePocket(pocketNumber);

            // Get and display the color of the pocket
            System.out.println("Pocket color: " + pocket.getPocketColor());
        }

        scanner.close();
    }
}
/*
Explanation:
Main Program (RouletteWheel):

Prompts the user for a pocket number 
(between 0 and 36). If the input is 
outside this range, it displays an 
error message. If the input is valid, 
it creates a RoulettePocket object and 
displays the corresponding pocket color.

*/