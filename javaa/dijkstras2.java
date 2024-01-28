import java.util.*;

class Graph {
    private int vertices;
    private List<List<Node>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Node node = new Node(destination, weight);
        this.adjacencyList.get(source).add(node);
    }

    public int[] dijkstra(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        priorityQueue.add(new Node(source, 0));

        while (!priorityQueue.isEmpty()) {
            int currentNode = priorityQueue.poll().vertex;

            for (Node neighbor : adjacencyList.get(currentNode)) {
                int newDistance = distance[currentNode] + neighbor.weight;
                if (newDistance < distance[neighbor.vertex]) {
                    distance[neighbor.vertex] = newDistance;
                    priorityQueue.add(new Node(neighbor.vertex, newDistance));
                }
            }
        }

        return distance;
    }

    private static class Node {
        private int vertex;
        private int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}

public class dijkstras2 {
    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);

        int source = 0;
        int[] distance = graph.dijkstra(source);

        for (int i = 0; i < vertices; i++) {
            System.out.println("Shortest distance from " + source + " to " + i + " is: " + distance[i]);
        }
    }
}
