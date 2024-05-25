package searchAndsort;

/*
 * Define a class to accept values into an array of double data type of size 20. Accept a double value from user and search in the array using linear search method. If value is found display message "Found" with its position where it is present in the array. Otherwise display message "not found".
 */

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double arr[] = new double[20];
        int l = arr.length;
        int i = 0;

        System.out.println("Enter array elements: ");
        for (i = 0; i < l; i++) {
            arr[i] = scan.nextDouble();
        }

        System.out.print("Enter the number to search: ");
        double n = scan.nextDouble();

        scan.close();

        for (i = 0; i < l; i++) {
            if (arr[i] == n) {
                break;
            }
        }

        if (i == l) {
            System.out.println("Not found");
        } else {
            System.out.println(n + " found at index " + i);
        }
    }
}