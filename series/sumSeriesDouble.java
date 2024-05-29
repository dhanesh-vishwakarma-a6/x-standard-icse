package series;

/*
 * Find the sum of the series up to value of n
 * S = 2/1 + 6/3 + 10/5 + 14/7 + ....... + n
 */

import java.util.Scanner;

public class sumSeriesDouble {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter the last limit: ");
        int limit = scan.nextInt();
        int sum = 0;

        // sum series
        for (int num = 1; (num * 2) <= limit; num += 2) {
            sum = sum + (num * 2 / num);
        }

        // for (int i = 1, j = 2; j <= limit; i = i + 2, j = j + 4) {
        // sum = sum + j / i;
        // }

        // display series
        System.out.println("Sum of the series: " + sum);

        scan.close();
    }
}
