public class Circle {
    // Fields
    private double radius;
    private final double PI = 3.14159;

    // Constructor accepting the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // No-arg constructor that sets radius to 0.0
    public Circle() {
        this.radius = 0.0;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return PI * radius * radius;
    }

    // Method to calculate diameter
    public double getDiameter() {
        return radius * 2;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * PI * radius;
    }
}
/*
Circle Class:

Contains fields for radius and PI 
(which is a constant set to 3.14159).
It has a constructor that accepts a 
radius value and a no-argument constructor 
that sets the radius to 0.0.
Includes methods to calculate and return 
the area, diameter, and circumference 
of the circle.

*/