package searchAndsort;

/*
 * Write a program to input twenty names in an array.
 * Arrange these names in descending order of letters,
 * using the bubble sort technique.
 */

 import java.util.Scanner;

 public class ArrangeNames
 {
     public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         String names[] = new String[20];
         System.out.println("Enter 20 names:");
         for (int i = 0;  i < names.length; i++) {
             names[i] = in.nextLine();
         }
 
         //Bubble Sort
         for (int i = 0; i < names.length - 1; i++) {
             for (int j = 0; j < names.length - 1 - i; j++) {
                 if (names[j].compareToIgnoreCase(names[j + 1]) < 0) {
                     String temp = names[j + 1];
                     names[j + 1] = names[j];
                     names[j] = temp;
                 }
             }
         }
         
         System.out.println("\nSorted Names");
         for (int i = 0;  i < names.length; i++) {
             System.out.println(names[i]);
         }
     }
 }
