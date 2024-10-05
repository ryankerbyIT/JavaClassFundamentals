import java.util.Scanner;

public class TestScores {
    // Fields
    private double score1;
    private double score2;
    private double score3;

    // Constructor
    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    // Setters (Mutators)
    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    // Getters (Accessors)
    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    // Method to calculate the average score
    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three test scores
        System.out.println("Enter the first test score:");
        double score1 = scanner.nextDouble();

        System.out.println("Enter the second test score:");
        double score2 = scanner.nextDouble();

        System.out.println("Enter the third test score:");
        double score3 = scanner.nextDouble();

        // Create a TestScores object
        TestScores testScores = new TestScores(score1, score2, score3);

        // Display the average score
        System.out.println("Average Test Score: " + testScores.getAverage());

        // Close scanner
        scanner.close();
    }
}
/*
Fields: score1, score2, and score3.
Methods: Includes setters for each 
score, and a method getAverage() to 
calculate the average of the three 
test scores. Main Program: Prompts 
the user to enter three test scores, 
then calculates and displays the 
average score.

*/