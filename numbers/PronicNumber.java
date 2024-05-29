package numbers;

import java.util.Scanner;

/*
 * Write a program to input a number and check and print whether it is a Pronic number or not. 
 * (Pronic number is the number which is the product of two consecutive integers)

Examples:
12 = 3 x 4
20 = 4 x 5
42 = 6 x 7
 */
public class PronicNumber {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = scan.nextInt();
        scan.close();

        // isPronic
        boolean isPronic = false;

        for (int i = 1; i <= num - 1; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        // display
        if (isPronic)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
    }
}
