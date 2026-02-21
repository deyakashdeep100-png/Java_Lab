class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println(name + " " + roll);
    }

    public static void main(String[] args) {
        Student s = new Student("Akash", 101);
        s.display();
    }
}