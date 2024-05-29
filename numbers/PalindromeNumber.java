package numbers;

import java.util.Scanner;

/*
 * Write a program in java to check whether input number is a palindrome number or not.
 * palindromic number is a number that is the same when written forwards or backwards.
 * 
 * example: 
 * 0,1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,101,111,
 * 151, 75257, 1234321
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        // number reversing process
        int num = number, reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        // check & display
        if (number == reverse) {
            System.out.println(number + " is a palindrom number");
        } else {
            System.out.println(number + " is not a palindrom number");
        }

    }
}
