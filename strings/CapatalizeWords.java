package strings;

/*
 * Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.

Sample input: we are in cyber world
Sample output: We Are In Cyber World
 */
import java.util.Scanner;

public class CapatalizeWords {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();
        String word = "";
        scan.close();

        // capatalize
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                word += Character.toUpperCase(str.charAt(i));
            } else {
                word += str.charAt(i);
            }
        }

        // display
        System.out.println(word);
    }
}
