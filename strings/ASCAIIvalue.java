package strings;

import java.util.Scanner;

public class ASCAIIvalue {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        char ch[] = new char[10];
        int len = ch.length;

        System.out.println("Enter 10 characters:");
        for (int i = 0; i < len; i++) {
            ch[i] = scan.nextLine().charAt(0);
        }

        scan.close();

        // 

        char h = ch[0];
        char l = ch[0];

        for (int i = 1; i < len; i++) {
            if (ch[i] > h) {
                h = ch[i];
            }

            if (ch[i] < l) {
                l = ch[i];
            }
        }

        // display
        System.out.println("Character with highest ASCII value: " + h);
        System.out.println("Character with lowest ASCII value: " + l);
    }
}
