import java.util.Scanner;
import java.util.Stack;

public class MinMaxStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the stack: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; ++i) {
            int value = scanner.nextInt();
            stack.push(value);
        }

        System.out.println("Minimum element in the stack: " + findMin(stack));
        System.out.println("Maximum element in the stack: " + findMax(stack));
    }

    private static int findMin(Stack<Integer> stack) {
        int min = stack.peek();
        for (int value : stack) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int findMax(Stack<Integer> stack) {
        int max = stack.peek();
        for (int value : stack) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
