package arrays;

/*
 * Define a class to declare an array to accept and store ten words. Display only those words which
 * begin with the letter 'A' or 'a' and also end with the letter 'A' or 'a'.
 * EXAMPLE :
 * Input : Hari, Anita, Akash, Amrita, Alina, Devi Rishab, John, Farha, AMITHA
 * Output: Anita
 * Amrita
 * Alina
 * AMITHA
 */

import java.util.Scanner;

public class ArrangeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = new String[10];

        // names input
        System.out.println("Enter 10 names:");
        for (int position = 0; position < names.length; position++) {
            names[position] = scan.nextLine();
        }

        scan.close();
        System.out.println("Names that begin and end with letter A are:");

        // filtering the names
        for (int position = 0; position < names.length; position++) {
            String name = names[position];
            int len = name.length();
            char begin = Character.toLowerCase(name.charAt(0));
            char end = Character.toLowerCase(name.charAt(len - 1));
            if (begin == 'a' && end == 'a') {
                System.out.println(name);
            }
        }
    }
}
