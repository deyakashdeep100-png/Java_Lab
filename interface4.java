import java.util.*;

interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int id;

    void getEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

class Interface4 {
    public static void main(String[] args) {
        Salary obj = new Salary();
        obj.getEmp();
        obj.getSalary();
        obj.display();
    }
}