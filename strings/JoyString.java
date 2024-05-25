package strings;

/*
 * Design a class to overload a function Joystring( ) as follows:

void Joystring(String s, char ch1, char ch2) with one string argument and two character arguments that replaces the character argument ch1 with the character argument ch2 in the given String s and prints the new string.
Example:
Input value of s = "TECHNALAGY"
ch1 = 'A'
ch2 = 'O'
Output: "TECHNOLOGY"
void Joystring(String s) with one string argument that prints the position of the first space and the last space of the given String s.
Example:
Input value of s = "Cloud computing means Internet based computing"
Output:
First index: 5
Last Index: 36
void Joystring(String s1, String s2) with two string arguments that combines the two strings with a space between them and prints the resultant string.
Example:
Input value of s1 = "COMMON WEALTH"
Input value of s2 = "GAMES"
Output: COMMON WEALTH GAMES
(Use library functions)
 */

public class JoyString {
    public void joystring(String s, char ch1, char ch2) {
        String newStr = s.replace(ch1, ch2);
        System.out.println(newStr);
    }

    public void joystring(String s) {
        int f = s.indexOf(' ');
        int l = s.lastIndexOf(' ');
        System.out.println("First index:  " + f);
        System.out.println("Last index:  " + l);
    }

    public void joystring(String s1, String s2) {
        String newStr = s1.concat(" ").concat(s2);
        System.out.println(newStr);
    }

    public static void main(String args[]) {
        JoyString obj = new JoyString();
        obj.joystring("TECHNALAGY", 'A', 'O');
        obj.joystring("Cloud computing means Internet based computing");
        obj.joystring("COMMON WEALTH", "GAMES");
    }
}
