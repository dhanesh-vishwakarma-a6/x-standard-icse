package methods;
/*
 * Design a class RailwayTicket with following description:

Instance variables/data members:
String name — To store the name of the customer
String coach — To store the type of coach customer wants to travel
long mobno — To store customer’s mobile number
int amt — To store basic amount of ticket
int totalamt — To store the amount to be paid after updating the original amount

Member methods:
void accept() — To take input for name, coach, mobile number and amount.
void update() — To update the amount as per the coach selected (extra amount to be added in the amount as follows)

Type of Coaches	Amount
First_AC	700
Second_AC	500
Third_AC	250
sleeper	None
void display() — To display all details of a customer such as name, coach, total amount and mobile number.

Write a main method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

class RailwayTicket {
    private String name;
    private String coach;
    private long mobno;
    private int amt;
    private int totalamt;

    void accept() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cutomer name: ");
        name = scan.nextLine();

        System.out.print("Enter cutomer coach: ");
        coach = scan.nextLine();

        System.out.print("Enter cutomer mob no: ");
        mobno = scan.nextLong();

        System.out.print("Enter amount: ");
        amt = scan.nextInt();

        scan.close();
    }

    void update() {
        if (coach.equalsIgnoreCase("First_AC")) {
            totalamt = amt + 700;
        }

        else if (coach.equalsIgnoreCase("Second_AC")) {
            totalamt = amt + 500;
        }

        else if (coach.equalsIgnoreCase("Third_AC")) {
            totalamt = amt + 250;
        }

        else if (coach.equalsIgnoreCase("Sleeper")) {
            totalamt = amt;
        }
    }

    void display() {
        System.out.println("Cutomer name: " + name);
        System.out.println("Cutomer coach: " + coach);
        System.out.println("Total amount: " + totalamt);
        System.out.println("Mobile number: " + mobno);
    }

    public static void main(String args[]) {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
