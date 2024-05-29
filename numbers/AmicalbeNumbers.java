package numbers;

/*
 * Write a Java program to check two numbers are Amicable numbers or not.
 * Amicable numbers are two different numbers so related that the sum of
 * the proper divisors of each is equal to the other number.
 * 
 * The first ten amicable pairs are:
 * (220, 284), (1184, 1210), (2620, 2924), (5020, 5564),
 * (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416),
 * (63020, 76084), and (66928, 66992).
 * 
 */

import java.util.Scanner;

public class AmicalbeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 01: ");
        int number01 = scan.nextInt();

        System.out.print("Enter number 02: ");
        int number02 = scan.nextInt();
        scan.close();

        // calculation
        int sum01 = 0, sum02 = 0;
        // number01 divisors
        for (int divisor = 1; divisor <= number01; divisor++) {
            if (number01 % divisor == 0)
                sum01 += divisor;
        }

        // number02 divisors
        for (int divisor = 1; divisor <= number02; divisor++) {
            if (number02 % divisor == 0)
                sum02 += divisor;
        }

        // check & display
        if (sum01 == number02 && sum02 == number01) {
            System.out.println("These numbers a amicalbe numbers");
        } else {
            System.out.println("These number are not amicable numbers");
        }

    }
}
