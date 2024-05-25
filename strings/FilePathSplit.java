package strings;

/*
 * Write a program to assign a full path and file name as given below. Using library functions, extract and output the file path, file name and file extension separately as shown.

Input
C:\Users\admin\Pictures\flower.jpg

Output
Path: C:\Users\admin\Pictures\
File name: flower
Extension: jpg
 */

import java.util.Scanner;

public class FilePathSplit {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter full path: ");
        String filepath = scan.next();
        scan.close();

        char pathSep = '\\';
        char dotSep = '.';

        int pathSepIdx = filepath.lastIndexOf(pathSep);
        System.out.println("Path:\t\t" + filepath.substring(0, pathSepIdx));

        int dotIdx = filepath.lastIndexOf(dotSep);
        System.out.println("File Name:\t" + filepath.substring(pathSepIdx + 1, dotIdx));

        System.out.println("Extension:\t" + filepath.substring(dotIdx + 1));
    }
}
