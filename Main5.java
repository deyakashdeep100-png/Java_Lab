// Abstract class
abstract class Asset {
    abstract void displayDetails();
}

// Stock class
class Stock extends Asset {
    void displayDetails() {
        System.out.println("Stock Asset Details");
    }
}

// Bond class
class Bond extends Asset {
    void displayDetails() {
        System.out.println("Bond Asset Details");
    }
}

// Savings class
class Savings extends Asset {
    void displayDetails() {
        System.out.println("Savings Asset Details");
    }
}

// Main class
public class Main5 {
    public static void main(String[] args) {
        Asset a;

        a = new Stock();
        a.displayDetails();

        a = new Bond();
        a.displayDetails();

        a = new Savings();
        a.displayDetails();
    }
}