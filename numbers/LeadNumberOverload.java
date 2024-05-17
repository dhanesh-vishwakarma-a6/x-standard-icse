package numbers;
/*
 * 
 */
import java.util.Scanner;

class LeadNumberOverload {
    // prints the pattern
    void print() {
        for (int row = 1; row < 5; row++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    // check the lead number
    void print(int number) {
        int evenSum = 0, oddSum = 0, num = 0;
        while (number != 0) {
            num = number % 10;
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            num = num / 10;
        }

        if (evenSum == oddSum) {
            System.out.print("Lead number");
        } else {
            System.out.print("Not a lead number");
        }
    }

    public static void main(String[] args) {
        LeadNumberOverload obj = new LeadNumberOverload();
        Scanner scan = new Scanner(System.in);

        // Pattern
        System.out.println("Pattern: ");
        obj.print();

        // Lead number
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        obj.print(num);

        scan.close();
    }
}
