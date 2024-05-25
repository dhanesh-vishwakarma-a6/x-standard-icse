package numbers;

/*
 * A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.

Example: Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of digits = 5 * 9 = 45
Sum of the sum of digits and product of digits = 14 + 45 = 59

Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value is equal to the number input, then display the message "Special two—digit number" otherwise, display the message "Not a special two-digit number".
 */

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        // variables
        int originalNumber, number, digit, sum = 0, count = 0, product = 1;

        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2-digit number: ");
        originalNumber = scan.nextInt();
        scan.close();

        // check special number
        number = originalNumber;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number = number / 10;
            count++;
        }

        // display result
        if (count != 2) {
            System.out.println("Not a special two-digit number");
        } else if (originalNumber == (sum + product)) {
            System.out.println("The number is special number");
        } else {
            System.out.println("The number is not a special number");
        }

    }
}
