public class MonthDays {
    // Fields
    private int month;
    private int year;

    // Constructor accepting month and year
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    // Method to determine if it's a leap year
    private boolean isLeapYear() {
        if (year % 100 == 0) {
            return (year % 400 == 0);
        } else {
            return (year % 4 == 0);
        }
    }

    // Method to return the number of days in the specified month
    public int numberOfDays() {
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear()) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0; // Invalid month
                break;
        }
        return days;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Get user input for month and year
        System.out.println("Enter a month (1-12):");
        int month = scanner.nextInt();
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        // Create MonthDays object and display number of days
        MonthDays md = new MonthDays(month, year);
        int days = md.numberOfDays();
        
        if (days > 0) {
            System.out.println("Number of days: " + days);
        } else {
            System.out.println("Invalid month.");
        }

        scanner.close();
    }
}
/*
Fields: month and year are the input 
from the user. Methods: isLeapYear() 
determines if the year is a leap year, 
and numberOfDays() returns the number of 
days in the given month.
Main Program: Takes user input for the 
month and year, creates a MonthDays object, 
and displays the number of days in that month.


*/