public class DiceGame {
    public static void main(String[] args) {
        // Create two Die objects: one for the computer and one for the user (6-sided dice)
        Die computerDie = new Die(6);
        Die userDie = new Die(6);

        int computerWins = 0;  // Count of computer wins
        int userWins = 0;      // Count of user wins

        // Loop to roll the dice 10 times
        for (int i = 1; i <= 10; i++) {
            // Roll both dice
            computerDie.roll();
            userDie.roll();

            // Display roll results
            System.out.println("Round " + i + ":");
            System.out.println("Computer rolled: " + computerDie.getValue());
            System.out.println("User rolled: " + userDie.getValue());

            // Determine the winner of this round
            if (computerDie.getValue() > userDie.getValue()) {
                System.out.println("Computer wins this round!");
                computerWins++;
            } else if (userDie.getValue() > computerDie.getValue()) {
                System.out.println("User wins this round!");
                userWins++;
            } else {
                System.out.println("This round is a tie!");
            }
            System.out.println();
        }

        // Determine and display the grand winner
        System.out.println("Final Results:");
        System.out.println("Computer wins: " + computerWins);
        System.out.println("User wins: " + userWins);

        if (computerWins > userWins) {
            System.out.println("Grand Winner: Computer!");
        } else if (userWins > computerWins) {
            System.out.println("Grand Winner: User!");
        } else {
            System.out.println("It's a tie overall!");
        }
    }
}
/* 
 * Explanation:
 * Main Program (DiceGame):

Two instances of Die are created, one for 
the computer and one for the user.
The program loops 10 times, rolling both 
dice in each iteration and displaying the 
result. The program tracks how many times 
the computer or user wins.
After 10 rounds, it displays the grand 
winner (or declares a tie if wins are equal).

*/
