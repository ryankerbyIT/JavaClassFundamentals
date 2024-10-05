import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SavingsAccountFromFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a SavingsAccount with a starting balance of 500.00
        SavingsAccount account = new SavingsAccount(500.00, 0.05);  // Example 5% interest rate

        // Open the Deposits.txt file
        File depositFile = new File("Deposits.txt");
        Scanner depositScanner = new Scanner(depositFile);

        // Read and process deposits
        while (depositScanner.hasNext()) {
            double deposit = depositScanner.nextDouble();
            account.deposit(deposit);
        }

        depositScanner.close();

        // Open the Withdrawals.txt file
        File withdrawalFile = new File("Withdrawals.txt");
        Scanner withdrawalScanner = new Scanner(withdrawalFile);

        // Read and process withdrawals
        while (withdrawalScanner.hasNext()) {
            double withdrawal = withdrawalScanner.nextDouble();
            account.withdraw(withdrawal);
        }

        withdrawalScanner.close();

        // Add monthly interest (assuming one month's worth of interest for simplicity)
        account.addMonthlyInterest();

        // Display results
        System.out.println("Ending balance: $" + account.getBalance());
        System.out.println("Total deposits: $" + account.getTotalDeposits());
        System.out.println("Total withdrawals: $" + account.getTotalWithdrawals());
        System.out.println("Total interest earned: $" + account.getTotalInterestEarned());
    }
}
/* 
Explanation for File Handling:
Instead of asking the user for input, the 
program reads deposit and withdrawal amounts 
from the Deposits.txt and Withdrawals.txt files.
After processing all entries, the monthly 
interest is added, and the ending balance is 
displayed along with the totals for deposits, 
withdrawals, and interest. Make sure the 
Deposits.txt and Withdrawals.txt files are 
in the correct format 

*/