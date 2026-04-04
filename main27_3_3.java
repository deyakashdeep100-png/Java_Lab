import java.util.*;

class main27_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = str.replace('d', 'f');

        System.out.println("Modified String: " + result);
    }
}