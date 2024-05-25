package menuDriven;

/*
 * Using switch statement, write a menu driven program to:
(i) To find and display all the factors of a number input by the user ( including 1 and the excluding the number itself).
Example:
Sample Input : n = 15
Sample Output : 1, 3, 5

(ii) To find and display the factorial of a number input by the user (the factorial of a non-negative integer n, denoted by n!, is the product of all integers less than or equal to n.)
Example:
Sample Input : n = 5
Sample Output : 5! = 1*2*3*4*5 = 120

For an incorrect choice, an appropriate error message should be displayed.
 */

import java.util.Scanner;

public class FactorAndFactorial {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Factors of number");
        System.out.println("2. Factorial of number");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        int num;

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                num = in.nextInt();
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                break;

            case 2:
                System.out.print("Enter number: ");
                num = in.nextInt();
                int f = 1;
                for (int i = 1; i <= num; i++)
                    f *= i;
                System.out.println("Factorial = " + f);
                break;

            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }

}
