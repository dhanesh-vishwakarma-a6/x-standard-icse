package strings;
/*
 * Special words are those words which start and end with the same letter.
Example: EXISTENCE, COMIC, WINDOW
Palindrome words are those words which read the same from left to right and vice-versa.
Example: MALYALAM, MADAM, LEVEL, ROTATOR, CIVIC
All palindromes are special words but all special words are not palindromes.

Write a program to accept a word. Check and display whether the word is a palindrome
or only a special word or none of them.
 */

import java.util.Scanner;

public class SpecialPalindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();
        str = str.toUpperCase();
        int len = str.length();

        if (str.charAt(0) == str.charAt(len - 1)) {
            boolean isPalin = true;
            for (int i = 1; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - 1 - i)) {
                    isPalin = false;
                    break;
                }
            }

            if (isPalin) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Special");
            }
        } else {
            System.out.println("Neither Special nor Palindrome");
        }

    }
}
