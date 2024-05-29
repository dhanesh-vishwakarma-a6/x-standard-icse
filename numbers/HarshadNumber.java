package numbers;

/*
 * Write a Java program to check whether a number is a Harshad Number or not.
 * In recreational mathematics, a harshad number in a given number base, 
 * is an integer that is divisible by the sum of its digits when written in that base.
 * 
 * Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 
 * and 0 is 2(2+0+0) and 200 is divisible by 2. 
 * 
 * Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) 
 * and 171 is divisible by 9.
 */

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        // calculation
        int num = number, digitSum = 0;
        while (num != 0) {
            digitSum += num % 10;
            num = num / 10;
        }

        // check and display
        if (number % digitSum == 0) {
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }
    }
}
