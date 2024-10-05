public class Temperature {
    // Field to hold the Fahrenheit temperature
    private double fahrenheit;

    // Constructor to accept a Fahrenheit temperature
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Setter for Fahrenheit temperature
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Getter for Fahrenheit temperature
    public double getFahrenheit() {
        return fahrenheit;
    }

    // Method to convert Fahrenheit to Celsius
    public double getCelsius() {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    // Method to convert Fahrenheit to Kelvin
    public double getKelvin() {
        return (5.0 / 9.0) * (fahrenheit - 32) + 273.15;
    }
}
/*
Temperature Class:
Contains a field for storing the 
Fahrenheit temperature. The constructor 
takes a Fahrenheit temperature and 
assigns it to the field. Provides methods 
to convert the Fahrenheit temperature to 
Celsius (getCelsius()) and Kelvin (getKelvin()).

*/