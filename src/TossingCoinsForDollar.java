import java.text.DecimalFormat;

public class TossingCoinsForDollar {
    public static void main(String[] args) {
        // Create three Coin objects representing a quarter, dime, and nickel
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        // Initial balance is 0
        double balance = 0.0;

        // Decimal format to display the balance properly
        DecimalFormat df = new DecimalFormat("#.00");

        // Continue tossing coins until the balance is 1 dollar or more
        while (balance < 1.0) {
            System.out.println("Tossing coins...");

            // Toss the quarter
            quarter.toss();
            if (quarter.getSideUp().equals("Heads")) {
                balance += 0.25;
                System.out.println("Quarter landed heads-up! +$0.25");
            } else {
                System.out.println("Quarter landed tails-up! No change.");
            }

            // Toss the dime
            dime.toss();
            if (dime.getSideUp().equals("Heads")) {
                balance += 0.10;
                System.out.println("Dime landed heads-up! +$0.10");
            } else {
                System.out.println("Dime landed tails-up! No change.");
            }

            // Toss the nickel
            nickel.toss();
            if (nickel.getSideUp().equals("Heads")) {
                balance += 0.05;
                System.out.println("Nickel landed heads-up! +$0.05");
            } else {
                System.out.println("Nickel landed tails-up! No change.");
            }

            // Display the current balance
            System.out.println("Current balance: $" + df.format(balance) + "\n");

            // Check if balance exceeds one dollar
            if (balance > 1.0) {
                System.out.println("Your balance is $" + df.format(balance) + ". You lose!");
                break;
            } else if (balance == 1.0) {
                System.out.println("Your balance is exactly $1.00. You win!");
                break;
            }
        }
    }
}
/*
Explanation:
Coin Class:

This is the same class as before, simulating a 
coin toss where it lands on either "Heads" or "Tails."

Main Program:

The program creates three Coin objects representing a 
quarter, a dime, and a nickel.
The game starts with a balance of $0.00, and each round, 
the program simulates tossing all three coins.
If the coin lands "Heads," the value of that coin 
(25 cents for a quarter, 10 cents for a dime, 5 cents 
for a nickel) is added to the balance.
If the balance reaches exactly $1.00, the player wins.
If the balance exceeds $1.00, the player loses.

*/