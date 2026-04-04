import java.util.*;

class Point {
    int x, y;

    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p = new Point();
    double radius;

    // ✅ ADD THIS CONSTRUCTOR
    Circle() {
    }

    void setCircle(int x, int y, double r) {
        p.setPoint(x, y);
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Center Point: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

class main27_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();  // now works

        System.out.println("Enter x and y coordinates:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter radius:");
        double r = sc.nextDouble();

        c.setCircle(x, y, r);
        c.display();
    }
}