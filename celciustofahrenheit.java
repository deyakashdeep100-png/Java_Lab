import java.util.Scanner;

class Temperature {
    double c;

    Temperature(double celsius) {
        c = celsius;
    }

    void convert() {
        double f = (c * 9/5) + 32;
        System.out.println("Fahrenheit = " + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        Temperature t = new Temperature(c);
        t.convert();
    }
}