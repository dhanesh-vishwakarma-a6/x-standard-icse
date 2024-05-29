package series;

/**
 * Write a program to input inteegers x and n. Find and print the sum of the following series.
 * S-x-(x^1/1!) + (x^2/2!) + (x^3/3!) + ........ (x^n/(n+1)!)
 */

import java.util.Scanner;

public class SumSeriesFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0.0;
        int fact = 1;

        System.out.print("Input value of x: ");
        int x = scan.nextInt();

        System.out.print("Input number of terms in n: ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {
            int p = (int) Math.pow(x, i);
            fact = 1;

            for (int k = 1; k <= i; k++) {
                fact *= k;
            }

            sum += (double) p / fact;
        }

        System.out.println("Output:\nSum of the series: " + sum);
    }
}
