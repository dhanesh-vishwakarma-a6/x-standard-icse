package numeberPatterns;

/*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

public class NumberTriangle02 {
    public static void main(String[] args) {
        for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
            for (int colNumber = 1; colNumber <= rowNumber; colNumber++) {
                System.err.print(rowNumber + " ");
            }
            System.out.println();
        }
    }
}
