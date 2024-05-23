package strings;
/*
 * Define a class to accept a string, and print the characters with the uppercase and lowercase reversed, but all the other characters should remain the same as before.

EXAMPLE:
INPUT : WelCoMe_2022
OUTPUT : wELcOmE_2022
 */

import java.util.Scanner;

public class ChangeCase {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        String rev = "";

        scan.close();

        // change case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    rev += Character.toLowerCase(ch);
                } else {
                    rev += Character.toUpperCase(ch);
                }
            } else {
                rev += ch;
            }
        }

        // display
        System.out.println(rev);

    }
}
