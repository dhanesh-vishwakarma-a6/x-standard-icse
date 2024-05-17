package methods;

/**
 * Define a class ElectricBill with the following specifications:

class : ElectricBill

Instance variables / data member:
String n — to store the name of the customer
int units — to store the number of units consumed
double bill — to store the amount to be paid

Member methods:
void accept( ) — to accept wthe name of the customer and number of units consumed
void calculate( ) — to calculate the bill as per the following tariff:

Number of units	Rate per unit
First 100 units	Rs.2.00
Next 200 units	Rs.3.00
Above 300 units	Rs.5.00
A surcharge of 2.5% charged if the number of units consumed is above 300 units.

void print( ) — To print the details as follows:
Name of the customer: ………………………
Number of units consumed: ………………………
Bill amount: ………………………

Write a main method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

class ElectricBill {
    private String n;
    private int units;
    private double bill;

    void accept() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name of customer: ");
        n = scan.nextLine();

        System.out.print("Enter number of unit consumed: ");
        units = scan.nextInt();

        scan.close();
    }

    void calculate() {
        if (units <= 100) {
            bill = units * 2;
        }

        else if (units > 100) {
            bill = 200 + (units - 100) * 3;
        }

        else if (units > 300) {
            bill = 600 + (units - 200) * 5;
        }

        else {
            double amt = 200 + 600 + (units - 300) * 5;
            double surcharge = (amt * 2.5) / 100.0;
            bill = amt + surcharge;
        }
    }

    void print() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }

    public static void main(String[] args) {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
