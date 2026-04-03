interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Method from Interface A");
    }

    public void showB() {
        System.out.println("Method from Interface B");
    }

    void showC() {
        System.out.println("Method of Class C");
    }
}

class Interface6 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}