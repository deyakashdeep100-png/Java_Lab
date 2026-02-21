import java.util.Scanner;

class ReverseNumber {
    int num;

    ReverseNumber(int n) {
        num = n;
    }

    void reverse() {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ReverseNumber obj = new ReverseNumber(n);
        obj.reverse();
    }
}