/*
 * Design a class to overload a function volume() as follows:

double volume (double R) – with radius (R) as an argument, returns the volume of sphere using the formula.
V = 4/3 x 22/7 x R3

double volume (double H, double R) – with height(H) and radius(R) as the arguments, returns the volume of a cylinder using the formula.
V = 22/7 x R2 x H

double volume (double L, double B, double H) – with length(L), breadth(B) and Height(H) as the arguments, returns the volume of a cuboid using the formula.
V = L x B x H
 */

public class VolumeOverLoad {
    double volume(double r) {
        return (4 / 3.0) * (22 / 7.0) * r * r * r;
    }

    double volume(double h, double r) {
        return (22 / 7.0) * r * r * h;
    }

    double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String args[]) {
        VolumeOverLoad obj = new VolumeOverLoad();
        System.out.println("Sphere Volume = " +
                obj.volume(6));
        System.out.println("Cylinder Volume = " +
                obj.volume(5, 3.5));
        System.out.println("Cuboid Volume = " +
                obj.volume(7.5, 3.5, 2));
    }
}
