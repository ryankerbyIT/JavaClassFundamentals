import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the starting balance
        System.out.print("Enter the starting balance: ");
        double startingBalance = scanner.nextDouble();

        // Get the annual interest rate
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        // Get the number of months
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount(startingBalance, annualInterestRate);

        // Loop for each month
        for (int i = 1; i <= months; i++) {
            // Get the deposit amount for the month
            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposit = scanner.nextDouble();
            account.deposit(deposit);

            // Get the withdrawal amount for the month
            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawal = scanner.nextDouble();
            account.withdraw(withdrawal);

            // Calculate and add monthly interest
            account.addMonthlyInterest();
        }

        // Display the ending balance, total deposits, withdrawals, and interest earned
        System.out.println("Ending balance: $" + account.getBalance());
        System.out.println("Total deposits: $" + account.getTotalDeposits());
        System.out.println("Total withdrawals: $" + account.getTotalWithdrawals());
        System.out.println("Total interest earned: $" + account.getTotalInterestEarned());

        scanner.close();
    }
}
/*
 * Explanation:
 * 
 * Main Program:

Takes input for the starting balance, 
annual interest rate, and the number 
of months. In a loop, asks for the 
deposit and withdrawal amounts for each 
month. Calculates the monthly interest 
and adds it to the balance. After the loop, 
displays the final balance, total deposits, 
total withdrawals, and total interest earned.

*/
