package numeberPatterns;

/*
 * Take input a character from the user and make a right angle triangle
 * example:
 * input => '#'
 * 
 * #
 * # #
 * # # #
 * # # # #
 * # # # # #
 * 
 * input => 'a'
 * 
 * a 
 * a a 
 * a a a 
 * a a a a 
 * a a a a a 
 * 
 */

import java.util.Scanner;

public class NumberTriangle03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a alphabet for pattern: ");
        String ch = scan.next();
        scan.close();

        for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
            for (int colNumber = 1; colNumber <= rowNumber; colNumber++) {
                System.err.print(ch + " ");
            }
            System.out.println();
        }
    }
}
