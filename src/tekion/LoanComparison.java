package tekion;

import java.util.Scanner;

public class LoanComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Bank A
        System.out.println("Enter details for Bank A:");
        double loanAmountA = getInput("Loan Amount: ");
        double annualInterestRateA = getInput("Annual Interest Rate: ");
        int tenureYearsA = (int) getInput("Loan Tenure (in years): ");

        // Input for Bank B
        System.out.println("\nEnter details for Bank B:");
        double loanAmountB = getInput("Loan Amount: ");
        double annualInterestRateB = getInput("Annual Interest Rate: ");
        int tenureYearsB = (int) getInput("Loan Tenure (in years): ");

        // Calculate total repayment for Bank A
        double totalRepaymentA = calculateTotalRepayment(loanAmountA, annualInterestRateA, tenureYearsA);

        // Calculate total repayment for Bank B
        double totalRepaymentB = calculateTotalRepayment(loanAmountB, annualInterestRateB, tenureYearsB);

        // Compare and print the results
        if (totalRepaymentA < totalRepaymentB) {
            System.out.println("\nBank A is the better choice. Total repayment amount: " + totalRepaymentA);
        } else {
            System.out.println("\nBank B is the better choice. Total repayment amount: " + totalRepaymentB);
        }
    }

    // Helper method to get user input
    private static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Helper method to calculate total repayment using the EMI formula
    private static double calculateTotalRepayment(double loanAmount, double annualInterestRate, int tenureYears) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfPayments = tenureYears * 12;

        double emi = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));

        return emi * numberOfPayments;
    }
}
