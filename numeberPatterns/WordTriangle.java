package numeberPatterns;

/*
 * Write a menu driven program to display the pattern as per user’s choice.

Pattern 1

ABCDE
ABCDs
ABC
AB
A

Pattern 2

B
LL
UUU
EEEE

For an incorrect option, an appropriate error message should be displayed.


 */

import java.util.Scanner;

public class WordTriangle {
    public static void main(String args[]) {
        // display
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 for pattern 1");
        System.out.println("Enter 2 for Pattern 2");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.close();

        // menu
        switch (choice) {
            case 1:
                for (int i = 69; i >= 65; i--) {
                    for (int j = 65; j <= i; j++) {
                        System.out.print((char) j);
                    }
                    System.out.println();
                }
                break;

            case 2:
                String word = "BLUE";
                int len = word.length();
                for (int i = 0; i < len; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(word.charAt(i));
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Incorrect choice");
                break;

        }
    }
}
