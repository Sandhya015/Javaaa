import java.util.Scanner;

public class insert {

    public static void displayArray(int[] arr) {
        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void insertElement(int[] arr, int size, int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element not inserted.");
            return;
        }

        
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        
        arr[position] = element;

        System.out.println("Element " + element + " inserted successfully at position " + position + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        displayArray(arr);

        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        System.out.print("Enter the position to insert the element: ");
        int insertPosition = scanner.nextInt();

        insertElement(arr, size, elementToInsert, insertPosition);

        displayArray(arr);

        scanner.close();
    }
}
