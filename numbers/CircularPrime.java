package numbers;
/*
 * Write a Java program to check if a given number is a circular prime or not.
 * 
 * Circular Prime : A circular prime is a prime number with the property that the number generated 
 * at each intermediate step when cyclically permuting its (base 10) digits will be prime.
 * 
 * For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime. 
 * A circular prime with at least two digits can only consist of combinations of the 
 * digits 1, 3, 7 or 9, because having 0, 2, 4, 6 or 8 as the last digit makes the number 
 * divisible by 2, and having 0 or 5 as the last digit makes it divisible by 5.
 * 
 * Test Data
 * Input a number: 35
 */

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
    }
}
