package numbers;

/*
 * Write a java program to check whether input number is a 3 digit narcissistic number or not.
 * A narcissistic number is a number that is the sum of its own digits
 * each raised to the power of the number of digits.
 * 
 * For example:
 * 153 = 1^3 + 5^3 + 3^3
 * 370 = 3^2 + 7^2 + 0^3
 */
import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        // calculation
        int num = number, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num = num / 10;
        }

        // check and display
        if (sum == number) {
            System.out.println(number + " is a narcissistic number");
        } else {
            System.out.println(number + " is not a narcissistic number");
        }
    }
}
