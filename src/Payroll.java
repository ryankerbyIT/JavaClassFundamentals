import java.util.Scanner;

public class Payroll {
    // Fields
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    // Constructor accepting name and ID number
    public Payroll(String employeeName, int idNumber) {
        this.employeeName = employeeName;
        this.idNumber = idNumber;
    }

    // Setters (Mutators)
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getters (Accessors)
    public String getEmployeeName() {
        return employeeName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Method to calculate gross pay
    public double getGrossPay() {
        return hoursWorked * hourlyPayRate;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for employee information
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee ID number:");
        int id = scanner.nextInt();

        // Create a Payroll object
        Payroll payroll = new Payroll(name, id);

        // Prompt the user for pay rate and hours worked
        System.out.println("Enter hourly pay rate:");
        double payRate = scanner.nextDouble();
        payroll.setHourlyPayRate(payRate);

        System.out.println("Enter hours worked:");
        double hours = scanner.nextDouble();
        payroll.setHoursWorked(hours);

        // Display gross pay
        System.out.println("Employee Name: " + payroll.getEmployeeName());
        System.out.println("Employee ID: " + payroll.getIdNumber());
        System.out.println("Gross Pay: $" + payroll.getGrossPay());

        // Close scanner
        scanner.close();
    }
}
/*
Fields: employeeName, idNumber, hourlyPayRate, 
and hoursWorked. Methods: Includes setters for 
hourly pay rate and hours worked, and a method 
getGrossPay() to calculate the gross pay 
(hours worked * hourly pay rate).
Main Program: Prompts the user to enter employee 
details, then calculates and displays 
the employee’s gross pay.

*/