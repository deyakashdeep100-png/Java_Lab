// Abstract class
abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
    }
}

// Subclass
class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int number, double price, double discountRate) {
        super(name, number, price);
        this.discountRate = discountRate;
    }

    void discount() {
        double discountAmount = modelPrice * discountRate / 100;
        System.out.println("Discount Amount: " + discountAmount);
    }

    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2025, 1000000, 10);

        car.display();
        car.discount();
    }
}