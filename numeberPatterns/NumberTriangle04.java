package numeberPatterns;

/*
 * Take input as a character from the user and make a right angle triangle using number digits.
 * example:
 * 
 * number = 62531
 * 
 * 1 
 * 3 3 
 * 5 5 5 
 * 2 2 2 2 
 * 6 6 6 6 6 
 */

import java.util.Scanner;

public class NumberTriangle04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for pattern: ");
        int number = scan.nextInt();
        scan.close();

        for (int rowNumber = 1; number != 0; rowNumber++) {
            int num = number % 10;
            for (int colNumber = 1; colNumber <= rowNumber; colNumber++) {
                System.err.print(num + " ");
            }
            number = number / 10;
            System.out.println();
        }
    }
}
