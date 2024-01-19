import java.util.Scanner;
import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Display Stack\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push onto the stack: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    displayStack(stack);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                        displayStack(stack);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;

                case 3:
                    displayStack(stack);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void displayStack(Stack<Integer> stack) {
        System.out.println("Stack: " + stack);
    }
}
