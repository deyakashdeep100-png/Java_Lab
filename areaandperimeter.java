import java.util.Scanner;

class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculate(int l, int b) {   // Area
        System.out.println("Area = " + (l * b));
    }

    void calculate(double l, double b) {  // Perimeter
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.calculate(l, b);
        r.calculate((double)l, (double)b);
    }
}