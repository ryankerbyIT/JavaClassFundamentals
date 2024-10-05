public class Car {
    // Fields
    private int yearModel;
    private String make;
    private int speed;

    // Constructor
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0; // speed starts at 0
    }

    // Accessor Methods (Getters)
    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    // Method to accelerate the car (increases speed by 5)
    public void accelerate() {
        speed += 5;
    }

    // Method to apply brakes (decreases speed by 5)
    public void brake() {
        if (speed >= 5) {
            speed -= 5;
        } else {
            speed = 0; // speed cannot go below 0
        }
    }
}
