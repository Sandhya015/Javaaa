class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class circular {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Inserting elements into the circular linked list
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);

        // Displaying the circular linked list
        System.out.print("Circular Linked List: ");
        circularList.display();
    }
}
