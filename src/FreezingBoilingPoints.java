public class FreezingBoilingPoints {
    // Field to store the temperature
    private double temperature;

    // Constants for freezing and boiling points
    private final int ETHYL_FREEZE = -173;
    private final int ETHYL_BOIL = 172;
    private final int OXYGEN_FREEZE = -362;
    private final int OXYGEN_BOIL = -306;
    private final int WATER_FREEZE = 32;
    private final int WATER_BOIL = 212;

    // Constructor to initialize temperature
    public FreezingBoilingPoints(double temp) {
        this.temperature = temp;
    }

    // Setters and Getters
    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public double getTemperature() {
        return temperature;
    }

    // Methods to check freezing and boiling points for each substance

    public boolean isEthylFreezing() {
        return temperature <= ETHYL_FREEZE;
    }

    public boolean isEthylBoiling() {
        return temperature >= ETHYL_BOIL;
    }

    public boolean isOxygenFreezing() {
        return temperature <= OXYGEN_FREEZE;
    }

    public boolean isOxygenBoiling() {
        return temperature >= OXYGEN_BOIL;
    }

    public boolean isWaterFreezing() {
        return temperature <= WATER_FREEZE;
    }

    public boolean isWaterBoiling() {
        return temperature >= WATER_BOIL;
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Get user input for temperature
        System.out.println("Enter a temperature:");
        double temp = scanner.nextDouble();

        // Create FreezingBoilingPoints object
        FreezingBoilingPoints fb = new FreezingBoilingPoints(temp);

        // Check and display the state of each substance
        System.out.println("At " + temp + " degrees:");
        
        if (fb.isEthylFreezing()) {
            System.out.println("Ethyl Alcohol will freeze.");
        }
        if (fb.isEthylBoiling()) {
            System.out.println("Ethyl Alcohol will boil.");
        }

        if (fb.isOxygenFreezing()) {
            System.out.println("Oxygen will freeze.");
        }
        if (fb.isOxygenBoiling()) {
            System.out.println("Oxygen will boil.");
        }

        if (fb.isWaterFreezing()) {
            System.out.println("Water will freeze.");
        }
        if (fb.isWaterBoiling()) {
            System.out.println("Water will boil.");
        }

        scanner.close();
    }
}
/*
Explanation:

Fields:

temperature: Stores the user-input temperature.
Constants for freezing and boiling points of 
Ethyl Alcohol, Oxygen, and Water.

Constructor:

Initializes the temperature field.

Methods:

isEthylFreezing(), isEthylBoiling(), 
isOxygenFreezing(), isOxygenBoiling(), 
isWaterFreezing(), and isWaterBoiling() 
are used to check if the current 
temperature falls within the freezing 
or boiling point range for each substance.
Main Program:

Prompts the user to input a temperature.
Displays which substances will freeze or 
boil at that temperature.

*/