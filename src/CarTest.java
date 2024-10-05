public class CarTest {
    public static void main(String[] args) {
        // Create a Car object with year model 2022 and make "Toyota"
        Car myCar = new Car(2022, "Toyota");

        // Accelerate the car 5 times and display speed after each acceleration
        System.out.println("Accelerating...");
        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Current speed: " + myCar.getSpeed() + " mph");
        }

        // Apply the brakes 5 times and display speed after each brake
        System.out.println("\nBraking...");
        for (int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Current speed: " + myCar.getSpeed() + " mph");
        }
    }
}
/*
Explanation:
Car Class:

Fields: yearModel (int), make (String), and speed (int) 
are the attributes of the car.
Constructor: Initializes the yearModel and make fields, 
and sets the speed to 0.
Accessors (Getters): These methods allow access to the 
private fields. Accelerate Method: Increases the car's 
speed by 5 mph every time it’s called.
Brake Method: Decreases the car's speed by 5 mph every 
time it’s called, but the speed cannot go below 0.

CarTest Class:

Demonstrates creating a Car object with a year model of 
2022 and make "Toyota". Calls the accelerate() method five 
times and prints the speed after each acceleration.
Calls the brake() method five times and prints 
the speed after each brake.
*/