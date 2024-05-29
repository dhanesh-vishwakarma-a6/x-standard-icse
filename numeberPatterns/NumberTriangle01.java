package numeberPatterns;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class NumberTriangle01 {
    public static void main(String[] args) {
        for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
            for (int colNumber = 1; colNumber <= rowNumber; colNumber++) {
                System.err.print(colNumber + " ");
            }
            System.out.println();
        }
    }
}
