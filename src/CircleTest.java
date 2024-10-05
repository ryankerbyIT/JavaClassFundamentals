import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Create a Circle object with the user input
        Circle myCircle = new Circle(radius);

        // Display the area, diameter, and circumference
        System.out.println("Circle with radius " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Diameter: " + myCircle.getDiameter());
        System.out.println("Circumference: " + myCircle.getCircumference());

        // Close the scanner
        scanner.close();
    }
}
/*
CircleTest Class:

Prompts the user for a radius value.
Creates a Circle object using the 
input radius. Displays the area, diameter, 
and circumference of the circle.

*/