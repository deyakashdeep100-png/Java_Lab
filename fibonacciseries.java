import java.util.Scanner;

class Fibonacci {
    int limit;

    Fibonacci(int n) {
        limit = n;
    }

    void printSeries() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        while (true) {
            int c = a + b;
            if (c > limit) break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci(n);
        obj.printSeries();
    }
}