/*
 * Design a class to overload a function area( ) as follows:

double area (double a, double b, double c) with three double arguments, returns the area of a scalene triangle using the formula:
area = √(s(s-a)(s-b)(s-c))
where s = (a+b+c) / 2
double area (int a, int b, int height) with three integer arguments, returns the area of a trapezium using the formula:
area = (1/2)height(a + b)
double area (double diagonal1, double diagonal2) with two double arguments, returns the area of a rhombus using the formula:
area = 1/2(diagonal1 x diagonal2)
 */

public class AreaOverload {
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        double result = Math.sqrt(x);
        return result;
    }

    double area(int a, int b, int height) {
        double result = (1.0 / 2.0) * height * (a + b);
        return result;
    }

    double area(double diagonal1, double diagonal2) {
        double result = 1.0 / 2.0 * diagonal1 * diagonal2;
        return result;
    }
}
