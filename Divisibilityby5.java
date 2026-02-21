import java.util.Scanner;

class Divisible {
    int num;

    Divisible(int n) {
        num = n;
    }

    void check() {
        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Divisible obj = new Divisible(n);
        obj.check();
    }
}