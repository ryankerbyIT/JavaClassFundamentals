import java.util.Scanner;

public class Assignment3RyanKerby {

    public static void main(String[] args) {
        // Create a Scanner object to obtain input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the test scores
        int score1, score2, score3;

        // Obtain three test scores from the user
        System.out.println("Please enter a test score");
        score1 = scanner.nextInt();

        System.out.println("Please enter a test score");
        score2 = scanner.nextInt();

        System.out.println("Please enter a test score");
        score3 = scanner.nextInt();

        // Calculate the average of the three test scores
        double average = (score1 + score2 + score3) / 3.0;

        // Display the average of the test scores
        System.out.println("Your test score average: " + average);

        // Close the Scanner object
        scanner.close();
    }
}
