import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        System.out.print("Enter " + n + " numbers: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        
        scanner.close();
    }
}
