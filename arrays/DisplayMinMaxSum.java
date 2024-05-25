package arrays;

/*
 * Write a program to input integer elements into an array of size 20 and perform the following operations:

Display largest number from the array.
Display smallest number from the array.
Display sum of all the elements of the array
 */

import java.util.Scanner;

public class DisplayMinMaxSum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0], max = arr[0], sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];

            sum += arr[i];
        }

        System.out.println("Largest Number = " + max);
        System.out.println("Smallest Number = " + min);
        System.out.println("Sum = " + sum);
    }
}
