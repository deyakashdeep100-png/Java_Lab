import java.util.Scanner;

class Maximum {
    int a, b, c;

    Maximum(int x, int y, int z) {
        a = x; b = y; c = z;
    }

    void findMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Maximum obj = new Maximum(x, y, z);
        obj.findMax();
    }
}