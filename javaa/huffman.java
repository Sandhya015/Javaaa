import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

public class huffman {

    public static void printCodes(HuffmanNode root, int[] arr, int top) {
        if (root.left != null) {
            arr[top] = 0;
            printCodes(root.left, arr, top + 1);
        }

        if (root.right != null) {
            arr[top] = 1;
            printCodes(root.right, arr, top + 1);
        }

        if (root.left == null && root.right == null) {
            System.out.print("Character: " + root.data + ", Huffman Code: ");
            for (int i = 0; i < top; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int[] frequencies = {5, 9, 12, 13, 16};

        int n = chars.length;

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(new HuffmanNode(chars[i], frequencies[i]));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode newNode = new HuffmanNode('$', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        HuffmanNode root = pq.poll();

        int[] arr = new int[100];
        int top = 0;

        printCodes(root, arr, top);
    }
}
