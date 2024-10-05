import java.util.Random;

public class Coin {
    private String sideUp;

    // No-arg constructor that randomly determines the initial side of the coin
    public Coin() {
        toss(); // Call toss method to initialize sideUp randomly
    }

    // Method to simulate tossing the coin
    public void toss() {
        Random rand = new Random();
        int tossResult = rand.nextInt(2); // 0 for heads, 1 for tails

        if (tossResult == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    // Method to get the current side facing up
    public String getSideUp() {
        return sideUp;
    }
}
/*
Explanation:
Coin Class:

The sideUp field holds either "Heads" or "Tails" 
depending on the current state of the coin.
The constructor calls the toss() method to randomly 
assign an initial side when the Coin object is created.
The toss() method uses Random to simulate the coin 
flip, where 0 means "Heads" and 1 means "Tails".
The getSideUp() method returns the current side of 
the coin that is facing up.

*/