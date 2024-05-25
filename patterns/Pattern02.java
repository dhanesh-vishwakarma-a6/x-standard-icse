package patterns;

/*
 * Write a java program to generate the pattern using iteration (loop) statements: 
 * (b)
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 */

public class Pattern02 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
