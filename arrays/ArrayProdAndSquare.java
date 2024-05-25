package arrays;
/*
 * Define a class to declare an numbersay of size twenty of double datatype, accept the elements into
 * the numbersay and perform the following :
 * 
 * Calculate and print the product of all the elements.
 * Print the square of each element of the numbersay.
 */

import java.util.Scanner;

class numbersayProdAndSquare {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        double numbers[] = new double[20];
        double product = 1.0;

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }
        scan.close();

        // calculate product of numbers
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }

        System.out.println("Product = " + product);

        System.out.println("Square of numbersay elements :");
        // calculate square of numbers
        for (int i = 0; i < numbers.length; i++) {
            double sq = Math.pow(numbers[i], 2);
            System.out.println(sq + " ");
        }
    }
}
