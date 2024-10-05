import java.util.Random;

public class Die {
    private int sides;  // Number of sides
    private int value;   // The value of the die

    // Constructor for a die with a given number of sides
    public Die(int sides) {
        this.sides = sides;
        roll(); // Roll the die to get an initial value
    }

    // Method to roll the die and set a random value
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1; // Random number between 1 and sides
    }

    // Method to get the die's current value
    public int getValue() {
        return value;
    }
}
/*
Explanation:
Die Class:

This class simulates a die with a set number 
of sides (6 sides in this case).
The roll() method sets a random value to the 
die, and getValue() retrieves the current value.

*/