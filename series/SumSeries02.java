package series;

/*
 * Find the sum of the series
 * S = 1/2 + 3/4 + 5/6 + 7/8 + 9/10 + ...... + 19/20
 */

public class SumSeries02 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 19; i += 2) {
            sum += (double) i / (i + 1);
        }

        System.out.println("The sum of the series is " + sum);
    }
}
