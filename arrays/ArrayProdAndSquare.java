package arrays;
/*
 * Define a class to declare an array of size twenty of double datatype, accept the elements into
 * the array and perform the following :
 * 
 * Calculate and print the product of all the elements.
 * Print the square of each element of the array.
 */

import java.util.Scanner;

class ArrayProdAndSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numbers[] = new double[20];
        double product = 1.0, square = 0.0;

        // input array elements
        System.out.println("Enter 20 numbers:");
        for (int num = 0; num < numbers.length; num++) {
            numbers[num] = scan.nextDouble();
        }

        scan.close();

        // product of all the array elements
        for (int num = 0; num < numbers.length; num++) {
            product *= numbers[num];
        }
        System.out.println("Product of array elements: " + product);

        // square of the array elements
        for (int num = 0; num < numbers.length; num++) {
            square = Math.pow(numbers[num], 2);
            System.err.println(square);
        }
    }
}
