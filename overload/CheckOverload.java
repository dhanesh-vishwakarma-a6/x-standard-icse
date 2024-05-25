/*
 * Design a class to overload a function check( ) as follows:

void check (String str , char ch ) — to find and print the frequency of a character in a string.
Example:
Input:
str = "success"
ch = 's'
Output:
number of s present is = 3

void check(String s1) — to display only vowels from string s1, after converting it to lower case.
Example:
Input:
s1 ="computer"
Output : o u e
 */

public class CheckOverload {
    void check(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (ch == c) {
                count++;
            }
        }
        System.out.println("Frequency of " + ch + " = " + count);
    }

    void check(String s1) {
        String s2 = s1.toLowerCase();
        int len = s2.length();
        System.out.println("Vowels:");
        for (int i = 0; i < len; i++) {
            char ch = s2.charAt(i);
            if (ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u')
                System.out.print(ch + " ");
        }
    }
}
