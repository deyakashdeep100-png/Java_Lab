import java.util.*;

interface Bank {
    double rateOfInterest();
}

class Customer {
    String name;
    int accNo;

    void getCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
    }
}

class Account extends Customer implements Bank {
    double balance;

    void getAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public double rateOfInterest() {
        return 6.5;
    }

    void display() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + rateOfInterest() + "%");
    }
}

class Interface2 {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.getCustomer();
        obj.getAccount();
        obj.display();
    }
}