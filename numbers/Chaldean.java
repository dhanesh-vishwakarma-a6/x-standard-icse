package numbers;

import java.util.Scanner;

class Chaldean {
    String name;
    int chaldeanNumber;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        name = scan.nextLine();
        scan.close();
    }

    static int getValue(char alphabet) {
        if (alphabet == 'a' ||
                alphabet == 'i' ||
                alphabet == 'j' ||
                alphabet == 'q' ||
                alphabet == 'y') {
            return 1;
        }

        else if (alphabet == 'b' ||
                alphabet == 'k' ||
                alphabet == 'r') {
            return 2;
        }

        else if (alphabet == 'c' ||
                alphabet == 'g' ||
                alphabet == 'l' ||
                alphabet == 's') {
            return 3;
        }

        else if (alphabet == 'd' ||
                alphabet == 'm' ||
                alphabet == 't') {
            return 4;
        }

        else if (alphabet == 'e' ||
                alphabet == 'h' ||
                alphabet == 'n' ||
                alphabet == 'x') {
            return 5;
        }

        else if (alphabet == 'u' ||
                alphabet == 'v' ||
                alphabet == 'w') {
            return 6;
        }

        else if (alphabet == 'o' ||
                alphabet == 'z') {
            return 7;
        }

        else if (alphabet == 'f' ||
                alphabet == 'p') {
            return 8;
        }

        else
            return 0;
    }

    void calculate() {
        name = name.toLowerCase().replaceAll(" ", "");
        for (char character : name.toCharArray()) {
            chaldeanNumber += getValue(character);
        }
    }

    void display() {
        System.out.println("Your Chaldean number is: " + chaldeanNumber);
    }

    public static void main(String[] args) {
        Chaldean chaldean = new Chaldean();
        chaldean.input();
        chaldean.calculate();
        chaldean.display();
    }
}