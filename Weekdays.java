import java.util.Scanner;

class Weekdays {
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        displayWeekday();
    }

    private static String getWeekdays(int number) {
        if (number == 1) {
            return "It's Monday";
        }

        else if (number == 2) {
            return "It's Tuesday";
        }

        else if (number == 3) {
            return "It's Wednesday";
        }

        else if (number == 4) {
            return "It's Thursday";
        }

        else if (number == 5) {
            return "It's Friday";
        }

        else if (number == 6) {
            return "It's Saturday";
        }

        else if (number == 7) {
            return "It's Sunday";
        }

        else {
            return "Wrong weekday. Enter day between 1 to 7";
        }
    }

    public static void displayWeekday() {
        System.out.println("Enter the day number");
        int num = scan.nextInt();
        System.out.println(getWeekdays(num));
    }
}