package methods;
/*
 * Design a class with the following specifications:
 * 
 * Class name: Student
 * Member variables:
 * name — name of student
 * age — age of student
 * mks — marks obtained
 * stream — stream allocated
 * (Declare the variables using appropriate data types)
 * 
 * Member methods:
 * void accept() — Accept name, age and marks using methods of Scanner class.
 * void allocation() — Allocate the stream as per following criteria:
 * 
 *  mks	stream
 * >= 300	Science and Computer
 * >= 200 and < 300	Commerce and Computer
 * >= 75 and < 200	Arts and Animation
 * < 75	Try Again
 * void print() – Display student name, age, mks and stream allocated.
 *  Call all the above methods in main method using an object.
 */

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int mks;
    private String stream;

    public void accept() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = input.nextLine();

        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Enter marks: ");
        mks = input.nextInt();

        input.close();
    }

    public void allocation() {
        if (mks >= 300) {
            stream = "Computer and Science";
        }

        else if (mks >= 200 && mks < 300) {
            stream = "Commerce and Computer";
        }

        else if (mks >= 75 && mks < 200) {
            stream = "Arts and Animation";
        }

        else if (mks < 75) {
            stream = "Try Again";
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + mks);
        System.out.println("Stream allocated: " + stream);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.accept();
        s1.allocation();
        s1.print();
    }
}
