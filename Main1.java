// Abstract class
abstract class ThreeDObject {
    // Abstract methods
    abstract double volume();
    abstract double wholeSurfaceArea();
}

// Box class
class Box extends ThreeDObject {
    double length, breadth, height;

    // Constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

// Cube class
class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    double volume() {
        return side * side * side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }
}

// Cylinder class
class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Cone class
class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    double volume() {
        return (1.0/3) * Math.PI * radius * radius * height;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(radius * radius + height * height); // slant height
        return Math.PI * radius * (radius + l);
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {

        // Using one reference variable
        ThreeDObject obj;

        obj = new Box(2, 3, 4);
        System.out.println("Box Volume: " + obj.volume());
        System.out.println("Box Surface Area: " + obj.wholeSurfaceArea());

        obj = new Cube(3);
        System.out.println("Cube Volume: " + obj.volume());
        System.out.println("Cube Surface Area: " + obj.wholeSurfaceArea());

        obj = new Cylinder(2, 5);
        System.out.println("Cylinder Volume: " + obj.volume());
        System.out.println("Cylinder Surface Area: " + obj.wholeSurfaceArea());

        obj = new Cone(2, 5);
        System.out.println("Cone Volume: " + obj.volume());
        System.out.println("Cone Surface Area: " + obj.wholeSurfaceArea());
    }
}