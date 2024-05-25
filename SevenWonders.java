/*
 * Write a program to initialize the seven Wonders of the World along with their locations in two different arrays. Search for a name of the country input by the user. If found, display the name of the country along with its Wonder, otherwise display "Sorry not found!".

Seven Wonders:
CHICHEN ITZA, CHRIST THE REDEEMER, TAJ MAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA, COLOSSEUM

Locations:
MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY

Examples:
Country name: INDIA
Output: TAJ MAHAL

Country name: USA
Output: Sorry Not found!
 */

import java.util.Scanner;

public class SevenWonders {
    public static void main(String args[]) {

        String wonders[] = { "CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL",
                "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM" };

        String locations[] = { "MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN",
                "ITALY" };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter country: ");
        String c = in.nextLine();
        int i;

        for (i = 0; i < locations.length; i++) {
            if (locations[i].equals(c)) {
                System.out.println(locations[i] + " - " + wonders[i]);
                break;
            }
        }

        if (i == locations.length)
            System.out.println("Sorry Not Found!");
    }
}
