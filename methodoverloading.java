class AreaOverloading {

    // Method to find area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }

    // Method to find area of rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    public static void main(String[] args) {
        AreaOverloading obj = new AreaOverloading();

        obj.area(5);        // square
        obj.area(4, 6);     // rectangle
    }
}