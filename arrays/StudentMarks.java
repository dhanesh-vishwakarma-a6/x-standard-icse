package arrays;
/*
 * Write a program to accept name and total marks of N number of students in two single subscript array name[] and totalmarks[].

Calculate and print:

The average of the total marks obtained by N number of students.
[average = (sum of total marks of all the students)/N]
Deviation of each student’s total marks with the average.
[deviation = total marks of a student – average]

 */

import java.util.Scanner;

public class StudentMarks {
    public static void main(String args[]) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();

        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int grandTotal = 0;

        for (int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            name[i] = scan.nextLine();
            System.out.print("Enter total marks of student " + (i + 1) + ": ");
            totalmarks[i] = scan.nextInt();
            grandTotal += totalmarks[i];
        }

        scan.close();

        // display
        double avg = grandTotal / (double) n;
        System.out.println("Average = " + avg);

        for (int i = 0; i < n; i++) {
            System.out.println("Deviation for " + name[i] + " = "
                    + (totalmarks[i] - avg));
        }
    }
}
