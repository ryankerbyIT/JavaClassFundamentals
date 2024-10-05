import java.util.Random;
import java.util.Scanner;

public class FishingGameSimulation {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for rolling the die
        Random random = new Random();
        
        // Variable to store total fishing points
        int totalPoints = 0;
        boolean keepFishing = true;

        // Game loop
        while (keepFishing) {
            // Roll the six-sided die
            int dieRoll = random.nextInt(6) + 1;

            // Determine what the player caught based on the die roll
            int points = 0;
            String catchItem = "";
            switch (dieRoll) {
                case 1:
                    catchItem = "a huge fish";
                    points = 10;
                    break;
                case 2:
                    catchItem = "an old shoe";
                    points = 2;
                    break;
                case 3:
                    catchItem = "a little fish";
                    points = 5;
                    break;
                case 4:
                    catchItem = "a big fish";
                    points = 8;
                    break;
                case 5:
                    catchItem = "a tin can";
                    points = 1;
                    break;
                case 6:
                    catchItem = "a small crab";
                    points = 7;
                    break;
                default:
                    catchItem = "nothing";
                    break;
            }

            // Add the points to the total score
            totalPoints += points;

            // Inform the player what they caught
            System.out.println("You caught " + catchItem + " and earned " + points + " points.");
            System.out.println("Your current total points: " + totalPoints);

            // Ask if the player wants to continue fishing
            System.out.print("Do you want to continue fishing? (yes/no): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                keepFishing = false;
            }
        }

        // Display final score and a message based on total points
        System.out.println("\nYou're done fishing!");
        System.out.println("Total fishing points: " + totalPoints);

        if (totalPoints >= 30) {
            System.out.println("Congratulations! You caught a lot of fish and did an amazing job!");
        } else if (totalPoints >= 15) {
            System.out.println("Good job! You caught a fair amount of fish.");
        } else {
            System.out.println("Better luck next time! You might need to find a better fishing spot.");
        }

        // Close the scanner
        scanner.close();
    }
}
/*
Explanation:
Fishing Items:

Each roll of the die determines the item caught 
(e.g., "huge fish", "old shoe"), and each item 
has a different point value associated with it.

Game Loop:

The game continues to roll the die and update the 
player's score as long as they choose to keep fishing.

Points & Message:

The total points accumulated during the game are 
hidden from the user until the end.
After the fishing session ends, the total points 
are displayed along with a congratulatory message 
based on the user's score.
This game simulates a simple fishing experience 
where the user keeps fishing until they choose to s
top, and the program displays their total score 
and a message at the end.

*/