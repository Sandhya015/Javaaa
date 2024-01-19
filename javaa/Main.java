import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int[] array = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = s.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }


        System.out.println("Entered Array: " + java.util.Arrays.toString(array));
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);

        s.close();
    }
}
