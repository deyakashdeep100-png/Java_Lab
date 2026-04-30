// Abstract class
abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    // Constructor
    Accounts(int accNo, String name, String address, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    // Abstract methods
    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    // Display method
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String address, double balance, double roi) {
        super(accNo, name, address, balance);
        this.rateOfInterest = roi;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Balance after interest: " + balance);
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(101, "Akash", "Kolkata", 5000, 5);

        acc.deposit(1000);
        acc.withdraw(500);
        acc.display();
        acc.calculateAmount();
    }
}