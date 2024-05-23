package numbers;
/*
 * A tech number has even number of digits. If the number is split in two equal halves, then the square of sum of these halves is equal to the number itself. Write a program to generate and print all four digits tech numbers.
 *  Example:
 * Consider the number 3025
 * Square of sum of the halves of 3025 = (30 + 25)2 = (55)2 = 3025 is a tech number.
 */

public class TechNumber {
    public static void main(String args[]) {
        for (int i = 1000; i <= 9999; i++) {
            int secondHalf = i % 100;
            int firstHalf = i / 100;
            int sum = firstHalf + secondHalf;
            if (i == sum * sum)
                System.out.println(i);
        }
    }
}
