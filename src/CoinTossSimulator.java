public class CoinTossSimulator {
    public static void main(String[] args) {
        // Create a Coin object
        Coin coin = new Coin();

        // Display the side initially facing up
        System.out.println("Initial side up: " + coin.getSideUp());

        int headsCount = 0;
        int tailsCount = 0;

        // Toss the coin 20 times and count how many times it lands on heads or tails
        for (int i = 1; i <= 20; i++) {
            coin.toss();  // Toss the coin
            System.out.println("Toss " + i + ": " + coin.getSideUp());

            // Count heads and tails
            if (coin.getSideUp().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Display the results
        System.out.println("\nResults after 20 tosses:");
        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
    }
}
/*
Explanation:
Main Program (CoinTossSimulator):

This program creates an instance of the 
Coin class and displays the initial side up.
It then tosses the coin 20 times, printing 
the result of each toss and counting the 
number of "Heads" and "Tails".
After 20 tosses, it displays the total 
counts for heads and tails.

*/