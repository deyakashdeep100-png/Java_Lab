import java.util.Scanner;

class Addition {
    int a, b;

    Addition(int x, int y) {   // Constructor
        a = x;
        b = y;
    }

    void add() {               // Member function
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Addition obj = new Addition(x, y);
        obj.add();
    }
}