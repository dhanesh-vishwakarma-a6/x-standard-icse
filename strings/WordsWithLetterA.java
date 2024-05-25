package strings;

/*
 * Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter 'A'.

Example:

Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY ARE EVER CHANGING.

Sample Output: Total number of words starting with letter 'A' = 4
 */
import java.util.Scanner;

public class WordsWithLetterA {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        scan.close();

        str = " " + str; // Add space in the begining of str
        int c = 0;
        int len = str.length();
        str = str.toUpperCase();
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == 'A')
                c++;
        }

        // display
        System.out.println("Total number of words starting with letter 'A' = " + c);
    }
}
