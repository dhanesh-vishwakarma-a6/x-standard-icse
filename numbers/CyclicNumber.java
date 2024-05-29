package numbers;

import java.util.Scanner;

/*
 * 
 * Write a Java program to check if a number is cyclic or not.
 * A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number.
 * 
 * The most widely known is 142857:
 * 
 * 142857 × 1 = 142857
 * 142857 × 2 = 285714
 * 142857 × 3 = 428571
 * 142857 × 4 = 571428
 * 142857 × 5 = 714285
 * 142857 × 6 = 857142
 * 
 * Input Data:
 * Input a number: 142857
 */

public class CyclicNumber {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        
    }
}
