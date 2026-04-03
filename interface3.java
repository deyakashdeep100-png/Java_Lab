interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: ₹" + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice for " + clientName + " of ₹" + amount + " generated.");
    }

    void showSummary() {
        System.out.println("All operations completed successfully.");
    }
}

class Interface3 {
    public static void main(String[] args) {
        CommercialExecutive obj = new CommercialExecutive();

        obj.processSale(5000);
        obj.generateInvoice("Akash", 5000);
        obj.showSummary();
    }
}