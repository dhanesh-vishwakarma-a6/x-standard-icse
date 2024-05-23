package strings;

import java.util.Scanner;

/*
 * Define a class to declare an array to accept and store ten words. Display only those words which begin with the letter 'A' or 'a' and also end with the letter 'A' or 'a'.
EXAMPLE :
Input : Hari, Anita, Akash, Amrita, Alina, Devi Rishab, John, Farha, AMITHA
Output: Anita
Amrita
Alina
AMITHA
 */
public class Words {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        String names[] = new String[10];
        int l = names.length;
        System.out.println("Enter 10 names : ");

        for (int i = 0; i < l; i++) {
            names[i] = scan.nextLine();
        }

        scan.close();

        System.out.println("Names that begin and end with letter A are:");

        // find words
        for (int i = 0; i < l; i++) {
            String str = names[i];
            int len = str.length();
            char begin = Character.toUpperCase(str.charAt(0));
            char end = Character.toUpperCase(str.charAt(len - 1));
            if (begin == 'A' && end == 'A') {
                System.out.println(str);
            }
        }
    }
}
