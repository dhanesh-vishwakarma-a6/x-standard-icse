/*
 * This program is to demonstrate the object and class concept.
 */

class Box {
    double width;
    double height;
    double depth;

    // constructor for Box
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // compute & return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box cube = new Box(10, 10, 10);
        double vol = cube.volume();
        System.out.print(vol);
    }
}
