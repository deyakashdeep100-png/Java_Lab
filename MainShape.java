import java.util.Scanner;

class Shape {
    double area;

    void display() {
        System.out.println("Area = " + area);
    }
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        area = l * b;
    }
}

class Square extends Shape {
    Square(double s) {
        area = s * s;
    }
}

class Circle extends Shape {
    Circle(double r) {
        area = 3.14 * r * r;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
        Square s = new Square(sc.nextDouble());
        Circle c = new Circle(sc.nextDouble());

        r.display();
        s.display();
        c.display();
    }
}