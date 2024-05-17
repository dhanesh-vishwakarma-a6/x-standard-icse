package dataTypes;

/*
 * This program demonstrates the use of 'double' data-type
 */


class Area {
    public static void main(String[] args) {
        double pi, radius, area;

        radius = 10.8; // radius of circle
        pi = 3.1416; // pi, approx
        area = pi * radius * radius; // compute area

        System.out.println("Area of a cicle is " + area);
    }
}