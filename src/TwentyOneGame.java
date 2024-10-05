import java.util.Random;
import java.util.Scanner;

public class TwentyOneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playerScore = 0;
        int computerScore = 0;
        boolean playerTurn = true;
        
        // Player's turn
        while (playerTurn) {
            System.out.println("Your current score: " + playerScore);
            System.out.print("Do you want to roll the dice? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            
            if (choice.equals("yes")) {
                int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1; // Roll two dice
                System.out.println("You rolled: " + roll);
                playerScore += roll;
                
                if (playerScore > 21) {
                    System.out.println("You went over 21! You lose.");
                    return;
                }
            } else {
                playerTurn = false;
             // Close scanner
                scanner.close();
            }
        }

        // Computer's turn
        while (computerScore < 17) {
            int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1; // Roll two dice for computer
            computerScore += roll;
        }

        System.out.println("Computer's total score: " + computerScore);

        // Determine the winner
        if (computerScore > 21 || playerScore > computerScore) {
            System.out.println("You win!");
        } else if (computerScore == playerScore) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    }
}
/*
The player is asked if they want to roll 
the dice. Each roll adds to their score.
The computer automatically rolls until 
its score reaches or exceeds 17.
If either the player or computer goes 
over 21, they lose. Once both turns are 
complete, the scores are compared to 
determine the winner.

*/