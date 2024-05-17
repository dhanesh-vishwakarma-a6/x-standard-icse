package methods;

/**
 * Define a class called with the following specifications:
 * 
 * Class name: Eshop
 * 
 * Member variables:
 * String name: name of the item purchased
 * double price: Price of the item purchased
 * 
 * Member methods:
 * void accept(): Accept the name and the price of the item using the methods of
 * Scanner class.
 * void calculate(): To calculate the net amount to be paid by a customer, based
 * on the following criteria:
 * 
 * Price Discount
 * 1000 – 25000 5.0%
 * 25001 – 57000 7.5 %
 * 57001 – 100000 10.0%
 * More than 100000 15.0 %
 * void display(): To display the name of the item and the net amount to be
 * paid.
 * 
 * Write the main method to create an object and call the above methods.
 */
import java.util.Scanner;

class Eshop {
    private String name;
    private double price;

    void accept() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter item name: ");
        name = scan.nextLine();

        System.out.print("Enter item price: ");
        price = scan.nextDouble();

        scan.close();
    }

    void calculate() {
        if (price >= 1000 && price <= 25000) {
            price = price - (price * 5 / 100);
        }

        else if (price >= 25001 && price <= 57000) {
            price = price - (price * 7.5 / 100);
        }

        else if (price >= 57001 && price <= 100000) {
            price = price - (price * 10 / 100);
        }

        else if (price > 100000) {
            price = price - (price * 15 / 100);
        }
    }

    void display() {
        System.out.println("Name of the item: " + name);
        System.out.println("Net amount: " + price);
    }

    public static void main(String[] args) {
        Eshop obj = new Eshop();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}