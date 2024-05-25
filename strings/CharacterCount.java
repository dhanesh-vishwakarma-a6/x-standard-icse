package strings;

/*
 * Define a class to accept a String and print the number of digits, alphabets and special
 * characters in the string.
 * 
 *  Example:
 * S = "KAPILDEV@83"
 * Output:
 * Number of digits – 2
 * Number of Alphabets – 8
 * Number of Special characters – 1
 */
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();

        int alphabetsCount = 0, digitsCount = 0, specialCharCount = 0;
        char ch;

        for (int pos = 0; pos < word.length(); pos++) {
            ch = word.charAt(pos);
            if (Character.isLetter(ch)) {
                alphabetsCount++;
            } else if (Character.isDigit(ch)) {
                digitsCount++;
            } else if (Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        System.out.println("Number of alphabets: " + alphabetsCount);
        System.out.println("Number of digits: " + digitsCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
