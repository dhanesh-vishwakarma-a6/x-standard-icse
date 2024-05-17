package methods;

/**
 * Define a class named BookFair with the following description:

Instance variables/Data members:
String Bname — stores the name of the book
double price — stores the price of the book

Member methods:
(i) BookFair() — Default constructor to initialize data members
(ii) void Input() — To input and store the name and the price of the book.
(iii) void calculate() — To calculate the price after discount. Discount is calculated based on the following criteria.

Price	Discount
Less than or equal to ₹1000	2% of price
More than ₹1000 and less than or equal to ₹3000	10% of price
More than ₹3000	15% of price
(iv) void display() — To display the name and price of the book after discount.

Write a main method to create an object of the class and call the above member methods.
 */
import java.util.Scanner;

class BookFair {
    private String Bname;
    private double price;

    BookFair() {
        Bname = "";
        price = 0.0d;
    }

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the book name: ");
        Bname = scan.nextLine();

        System.out.print("Enter the book price: ");
        price = scan.nextDouble();

        scan.close();
    }

    void calculate() {
        if (price <= 1000) {
            price = price - (price * 2 / 100);
        }

        else if (price > 1000 && price <= 3000) {
            price = price - (price * 10 / 100);
        }

        else if (price > 3000) {
            price = price - (price * 15 / 100);
        }
    }

    void display() {
        System.out.println("Book name: " + Bname);
        System.out.println("Price after discount: " + price);
    }

    public static void main(String[] args) {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
