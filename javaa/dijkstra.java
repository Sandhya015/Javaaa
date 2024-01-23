import java.util.Scanner;

public class dijkstra {

    private static final int INFINITY = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();

        int[][] graph = new int[vertices][vertices];

        System.out.println("Enter the adjacency matrix for the graph:");

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();

        System.out.print("Enter the destination vertex: ");
        int destination = scanner.nextInt();

        int[] distances = dijkstra(graph, source);

        int shortestDistance = distances[destination];

        if (shortestDistance == INFINITY) {
            System.out.println("There is no path from " + source + " to " + destination);
        } else {
            System.out.println("Shortest distance from " + source + " to " + destination + " is: " + shortestDistance);
        }
    }

    private static int[] dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            distances[i] = INFINITY;
            visited[i] = false;
        }

        distances[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(distances, visited);

            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && distances[u] != INFINITY &&
                        distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                }
            }
        }

        return distances;
    }

    private static int minDistance(int[] distances, boolean[] visited) {
        int min = INFINITY;
        int minIndex = -1;

        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] <= min) {
                min = distances[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
