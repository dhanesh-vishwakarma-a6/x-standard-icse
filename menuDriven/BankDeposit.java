package menuDriven;

/*
 * Using the switch statement, write a menu driven program to calculate the
 * maturity amount of a Bank Deposit.
 * The user is given the following options:
 * 
 * Term Deposit
 * Recurring Deposit
 * For option 1, accept principal (P), rate of interest(r) and time period in
 * years(n). Calculate and output the maturity amount(A) receivable using the
 * formula:
 * 
 * A = P[1 + r / 100]n
 * 
 * For option 2, accept Monthly Installment (P), rate of interest (r) and time
 * period in months (n). Calculate and output the maturity amount (A) receivable
 * using the formula:
 * 
 * A = P x n + P x (n(n+1) / 2) x r / 100 x 1 / 12
 * 
 * For an incorrect option, an appropriate error message should be displayed.
 */

import java.util.Scanner;

public class BankDeposit {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Type 1 for Term Deposit");
        System.out.println("Type 2 for Recurring Deposit");
        System.out.print("Enter your choice: ");
        int ch = scan.nextInt();

        double p = 0.0, r = 0.0, a = 0.0;
        int n = 0;

        switch (ch) {
            case 1:
                System.out.print("Enter Principal: ");
                p = scan.nextDouble();
                System.out.print("Enter Interest Rate: ");
                r = scan.nextDouble();
                System.out.print("Enter time in years: ");
                n = scan.nextInt();
                a = p * Math.pow(1 + r / 100, n);
                System.out.println("Maturity amount = " + a);
                break;

            case 2:
                System.out.print("Enter Monthly Installment: ");
                p = scan.nextDouble();
                System.out.print("Enter Interest Rate: ");
                r = scan.nextDouble();
                System.out.print("Enter time in months: ");
                n = scan.nextInt();
                a = p * n + p * ((n * (n + 1)) / 2) * (r / 100) * (1 / 12.0);
                System.out.println("Maturity amount = " + a);
                break;

            default:
                System.out.println("Invalid choice");
        }

        scan.close();
    }
}