package numbers;
/*
 * Write a program to accept a number and check and display whether it is a Niven number or not.
(Niven number is that number which is divisible by its sum of digits.).

Example:
Consider the number 126. Sum of its digits is 1 + 2 + 6 = 9 and 126 is divisible by 9.
 */

 import java.util.Scanner;

 public class NivenNumber
 {
     public void checkNiven() {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter number: ");
         int num = in.nextInt();
         int orgNum = num;
         
         int digitSum = 0;
         
         while (num != 0) {
             int digit = num % 10;
             num /= 10;
             digitSum += digit;
         }
         
         /*
          * digitSum != 0 check prevents
          * division by zero error for the
          * case when users gives the number
          * 0 as input
          */
         if (digitSum != 0 && orgNum % digitSum == 0)
             System.out.println(orgNum + " is a Niven number");
         else
             System.out.println(orgNum + " is not a Niven number");
     }
 }