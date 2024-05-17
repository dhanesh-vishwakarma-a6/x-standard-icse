package methods;

/*
 * Design a class name ShowRoom with the following description:

Instance variables / Data members:
String name — To store the name of the customer
long mobno — To store the mobile number of the customer
double cost — To store the cost of the items purchased
double dis — To store the discount amount
double amount — To store the amount to be paid after discount

Member methods:
ShowRoom() — default constructor to initialize data members
void input() — To input customer name, mobile number, cost
void calculate() — To calculate discount on the cost of purchased items, based on following criteria

Cost	Discount (in percentage)
Less than or equal to ₹10000	5%
More than ₹10000 and less than or equal to ₹20000	10%
More than ₹20000 and less than or equal to ₹35000	15%
More than ₹35000	20%
void display() — To display customer name, mobile number, amount to be paid after discount.

Write a main method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

class ShowRoom {
    private String name;
    private long mobno;
    private double cost;
    private double dis;
    private double amount;

    ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the customer: ");
        name = scan.nextLine();

        System.out.println("Enter mobile number: ");
        mobno = scan.nextLong();

        System.out.println("Enter cost: ");
        cost = scan.nextDouble();

        scan.close();
    }

    void calculate() {

        if (cost <= 10000) {
            dis = 5;
        } else if (cost > 10000 && cost <= 20000) {
            dis = 10;
        } else if (cost > 20000 && cost <= 35000) {
            dis = 15;
        } else if (cost > 35000) {
            dis = 20;
        }

        dis = cost * dis / 100.0;
        amount = cost - dis;
    }

    void display() {
        System.out.println("Customer name : " + name);
        System.out.println("Customer mobile no : " + mobno);
        System.out.println("Amount after discount : " + amount);
    }

    public static void main(String[] args) {
        ShowRoom obj = new ShowRoom();
        obj.amount = 10000;
    }
}