package strings;

/*
 * Define a class to accept two strings of same length and form a new word in such a way that, the
 * first character of the first word is followed by the first character of the second word and so on.
 * Example :
 * Input word1 – BALL
 * Input word2 – WORD
 * 
 *  OUTPUT : BWAOLRLD
 */
import java.util.Scanner;

public class WordsMerge {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st word: ");
        String word1 = scan.nextLine();

        System.out.print("Enter 2nd word: ");
        String word2 = scan.nextLine();
        String newWord = "";

        scan.close();

        // word merging char by char
        if (word1.length() == word2.length()) {
            for (int position = 0; position < word1.length(); position++) {
                char ch1 = word1.charAt(position);
                char ch2 = word2.charAt(position);
                newWord = newWord + ch1 + ch2;
            }
            System.out.println("New word: " + newWord);
        } else {
            System.out.println("Words are not of same length.");
        }

    }
}
