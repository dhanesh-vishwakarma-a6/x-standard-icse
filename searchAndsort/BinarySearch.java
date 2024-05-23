package searchAndsort;

/*
 * Define a class to perform binary search on a list of integers given below, to search for an element input by the user, if it is found display the element along with its position, otherwise display the message "Search element not found".

2, 5, 7, 10, 15, 20, 29, 30, 46, 50
 */
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        // user input
        Scanner scan = new Scanner(System.in);
        int arr[] = { 2, 5, 7, 10, 15, 20, 29, 30, 46, 50 };

        System.out.print("Enter number to search: ");
        int n = scan.nextInt();

        scan.close();

        // binay search
        int l = 0, h = arr.length - 1, index = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < n)
                l = m + 1;
            else if (arr[m] > n)
                h = m - 1;
            else {
                index = m;
                break;
            }

        }

        // display
        if (index == -1) {
            System.out.println("Search element not found");
        } else {
            System.out.println(n + " found at position " + index);
        }
    }
}
