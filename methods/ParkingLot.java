package methods;
/*
 * Define a class called ParkingLot with the following description:

Instance variables/data members:
int vno — To store the vehicle number.
int hours — To store the number of hours the vehicle is parked in the parking lot.
double bill — To store the bill amount.

Member Methods:
void input() — To input and store the vno and hours.
void calculate() — To compute the parking charge at the rate of ₹3 for the first hour or part thereof, and ₹1.50 for each additional hour or part thereof.
void display() — To display the detail.

Write a main() method to create an object of the class and call the above methods.
 */

import java.util.Scanner;

class ParkingLot {
    private int vno;
    private int hours;
    private double bill;

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        vno = scan.nextInt();

        System.out.print("Enter hours : ");
        hours = scan.nextInt();

        scan.close();
    }

    void calculate() {
        if (hours <= 1) {
            bill = 3;
        }

        else if (hours > 1) {
            bill = 3 + (hours - 1) * 1.5;
        }
    }

    void display() {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Hours: " + hours);
        System.out.println("Bill: ₹ " + bill);
    }

    public static void main(String[] args) {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
