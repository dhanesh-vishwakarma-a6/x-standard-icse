/*
 * 
 */
package controlStatements;

public class monthNumber {
    public static void main(String[] args) {
        String month = "march";
        int number;

        switch (month) {
            case "january":
                number = 1;
                break;

            case "february":
                number = 2;
                break;

            case "march":
                number = 3;
                break;

            case "april":
                number = 4;
                break;

            case "may":
                number = 5;
                break;

            case "june":
                number = 6;
                break;

            case "july":
                number = 7;
                break;

            case "august":
                number = 8;
                break;

            case "september":
                number = 9;
                break;

            case "october":
                number = 10;
                break;

            case "november":
                number = 11;
                break;

            case "december":
                number = 12;
                break;

            default:
                number = -1;
                break;
        }
        if (number >= 1 && number <= 12) {
            System.out.println("It is " + month + " month of the year");
        } else {
            System.out.println("Bogus month");
        }
    }
}
