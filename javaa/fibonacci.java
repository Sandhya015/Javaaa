
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        } else if (n == 1 || n == 2) {
            System.out.println("Result = 1");
            return;
        }

        int result = 0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 3; i <= n; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        System.out.println("Result = " + result);
    }
}