import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
    
        Queue<Integer> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements to push into the queue: ");
        int numberOfElements = scanner.nextInt();

       
        System.out.println("Enter elements to push into the queue:");
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            queue.add(element);
        }

        
        System.out.println("Queue elements: " + queue);

        
        if (!queue.isEmpty()) {
            int removedElement = queue.poll();
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Queue is empty. Cannot remove element.");
        }

    
        System.out.println("Updated queue: " + queue);

        scanner.close();
    }
}
