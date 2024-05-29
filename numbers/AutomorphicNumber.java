package numbers;

import java.util.Scanner;

/*
 * Write a Java program to check whether a number is an automorphic number or not.
 * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself.
 * For example, 5^2 = 2^5, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625,
 * so 5, 6, 76 and 890625 are all automorphic numbers.
 */

public class AutomorphicNumber {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        int num = number, digitCount = 0;
        int numberSquare = number * number;
        boolean isAutomorphic;

        // digit counter
        while (num != 0) {
            num /= 10;
            digitCount += 1;
        }

        // check automorphic
        isAutomorphic = (numberSquare % (int) Math.pow(10, digitCount)) == number ? true : false;

        // display
        if (isAutomorphic) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }
    }
}
