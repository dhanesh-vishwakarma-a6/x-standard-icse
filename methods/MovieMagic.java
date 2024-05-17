package methods;

/*
 * Define a class named movieMagic with the following description:

Data Members	Purpose
int year	To store the year of release of a movie
String title	To store the title of the movie
float rating	To store the popularity rating of the movie
(minimum rating=0.0 and maximum rating=5.0)

Member Methods	Purpose
movieMagic()	Default constructor to initialize numeric data members to 0 and String data member to "".
void accept()	To input and store year, title and rating
void display()	To display the title of the movie and a message based on the rating as per the table given below
Ratings Table
Rating	Message to be displayed
0.0 to 2.0	Flop
2.1 to 3.4	Semi-Hit
3.5 to 4.4	Hit
4.5 to 5.0	Super-Hit
Write a main method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

class MovieMagic {
    private int year;
    private String title;
    private float rating;
    private String msg;

    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    void accept() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        title = scan.nextLine();

        System.out.print("Enter movie year: ");
        year = scan.nextInt();

        System.out.print("Enter movie rating: ");
        rating = scan.nextFloat();

        scan.close();
    }

    void message() {
        if (rating >= 0.0 && rating <= 2.0) {
            msg = "Flop";
        } else if (rating >= 2.1 && rating <= 3.4) {
            msg = "Semi-Hit";
        } else if (rating >= 3.5 && rating <= 4.4) {
            msg = "Hit";
        } else if (rating >= 4.5 && rating <= 5.0) {
            msg = "Super-Hit";
        } else {
            msg = "Invalid Rating";
        }
    }

    void display() {
        System.out.println("Movie name: " + title);
        System.out.println("Movie year: " + year);
        System.out.println("Movie rating: " + rating);
        System.out.println(msg);

    }

    public static void main(String[] args) {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}
