public class SavingsAccount {
    private double balance;    // Account balance
    private double annualInterestRate; // Annual interest rate
    private double totalDeposits = 0;
    private double totalWithdrawals = 0;
    private double totalInterestEarned = 0;

    // Constructor
    public SavingsAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        totalDeposits += amount;
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            totalWithdrawals += amount;
        } else {
            System.out.println("Withdrawal amount exceeds balance.");
        }
    }

    // Method to add monthly interest to the balance
    public void addMonthlyInterest() {
        double monthlyInterestRate = (annualInterestRate / 12);
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
        totalInterestEarned += monthlyInterest;
    }

    // Getters for reporting
    public double getBalance() {
        return balance;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    public double getTotalInterestEarned() {
        return totalInterestEarned;
    }
}
/*
Explanation:
SavingsAccount Class:

The class stores the balance, annual 
interest rate, total deposits, total 
withdrawals, and total interest earned.
Methods to: deposit() and withdraw() handle 
transactions. addMonthlyInterest() 
calculates and adds monthly interest to 
the balance. Getters for retrieving the 
total deposits, withdrawals, and interest.

*/