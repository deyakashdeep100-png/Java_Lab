class Demo {
    int a;

    Demo() {
        a = 0;
    }

    Demo(int x) {
        a = x;
    }

    void display() {
        System.out.println("Value = " + a);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);

        d1.display();
        d2.display();
    }
}