public class RoulettePocket {
    private int pocketNumber;

    // Constructor that accepts the pocket number
    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    // Method to return the color of the pocket
    public String getPocketColor() {
        if (pocketNumber == 0) {
            return "Green";
        } else if (pocketNumber >= 1 && pocketNumber <= 10) {
            if (pocketNumber % 2 == 0) {
                return "Black";  // Even pockets are black
            } else {
                return "Red";    // Odd pockets are red
            }
        } else if (pocketNumber >= 11 && pocketNumber <= 18) {
            if (pocketNumber % 2 == 0) {
                return "Red";    // Even pockets are red
            } else {
                return "Black";  // Odd pockets are black
            }
        } else if (pocketNumber >= 19 && pocketNumber <= 28) {
            if (pocketNumber % 2 == 0) {
                return "Black";  // Even pockets are black
            } else {
                return "Red";    // Odd pockets are red
            }
        } else if (pocketNumber >= 29 && pocketNumber <= 36) {
            if (pocketNumber % 2 == 0) {
                return "Red";    // Even pockets are red
            } else {
                return "Black";  // Odd pockets are black
            }
        } else {
            return "Invalid";    // Invalid pocket number
        }
    }
}
/*
Explanation:
RoulettePocket Class:

This class takes a pocket number as input 
and determines its color based on the rules 
provided. The getPocketColor() method checks 
the number and returns the correct color 
("Red", "Black", or "Green"). If the number 
is invalid, it returns "Invalid".

*/