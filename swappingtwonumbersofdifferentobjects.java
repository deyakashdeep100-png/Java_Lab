import java.util.Scanner;

class Swap {
    int num;

    Swap(int n) {
        num = n;
    }

    void swap(Swap obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println("Value = " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Swap obj1 = new Swap(a);
        Swap obj2 = new Swap(b);

        obj1.swap(obj2);

        obj1.display();
        obj2.display();
    }
}
