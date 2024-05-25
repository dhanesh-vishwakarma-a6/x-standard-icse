package searchAndsort;

import java.util.Scanner;

/*
 * Write a program to input forty words in an array.
 * Arrange these words in descending order of alphabets, 
 * using selection sort technique. Print the sorted array.
 */

public class SelectionSort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a[] = new String[40];
        int n = a.length;

        System.out.println("Enter 40 Names: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareToIgnoreCase(a[idx]) < 0) {
                    idx = j;
                }
            }
            String t = a[idx];
            a[idx] = a[i];
            a[i] = t;
        }

        System.out.println("Sorted Names");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
