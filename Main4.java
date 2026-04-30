// Abstract class
abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        product_id = id;
    }

    abstract void display();
}

// Book class
class TravelGuide extends AbstractProduct {
    String title;

    TravelGuide(int id, String title) {
        super(id);
        this.title = title;
    }

    void display() {
        System.out.println("Travel Guide ID: " + product_id);
        System.out.println("Title: " + title);
    }
}

// CD class
class CD extends AbstractProduct {
    String name;

    CD(int id, String name) {
        super(id);
        this.name = name;
    }

    void display() {
        System.out.println("CD ID: " + product_id);
        System.out.println("Name: " + name);
    }
}

// Main class
public class Main4 {
    public static void main(String[] args) {
        AbstractProduct p1 = new TravelGuide(1, "India Tour Guide");
        AbstractProduct p2 = new CD(2, "Music Album");

        p1.display();
        p2.display();
    }
}