import java.util.*;

public class Graph {

    private Map<Integer, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {

        Edge edge = new Edge(source, destination, weight);

        adjList.get(source.getId()).add(edge);
    }

    public void printGraph() {

        for (int vertex : adjList.keySet()) {

            System.out.print(vertex + " -> ");

            for (Edge edge : adjList.get(vertex)) {

                System.out.print(
                        edge.getDestination().getId()
                                + "(" + edge.getWeight() + ") ");
            }

            System.out.println();
        }
    }

    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);

        queue.add(start);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (Edge edge : adjList.get(current)) {

                int neighbor = edge.getDestination().getId();

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);

                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int start) {

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS: ");

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int current, Set<Integer> visited) {

        visited.add(current);

        System.out.print(current + " ");

        for (Edge edge : adjList.get(current)) {

            int neighbor = edge.getDestination().getId();

            if (!visited.contains(neighbor)) {

                dfsHelper(neighbor, visited);
            }
        }
    }

    // Dijkstra Algorithm

    public void dijkstra(int start) {

        Map<Integer, Integer> distance = new HashMap<>();

        Set<Integer> visited = new HashSet<>();

        // initialize distances

        for (int vertex : adjList.keySet()) {

            distance.put(vertex, Integer.MAX_VALUE);
        }

        distance.put(start, 0);

        for (int i = 0; i < adjList.size(); i++) {

            int current = getMinDistanceVertex(distance, visited);

            visited.add(current);

            for (Edge edge : adjList.get(current)) {

                int neighbor = edge.getDestination().getId();

                int newDistance =
                        distance.get(current) + edge.getWeight();

                if (!visited.contains(neighbor)
                        && newDistance < distance.get(neighbor)) {

                    distance.put(neighbor, newDistance);
                }
            }
        }

        // print shortest distances

        System.out.println("Shortest distances from vertex " + start);

        for (int vertex : distance.keySet()) {

            System.out.println(
                    "To " + vertex + " = " + distance.get(vertex));
        }
    }

    private int getMinDistanceVertex(
            Map<Integer, Integer> distance,
            Set<Integer> visited) {

        int minVertex = -1;

        int minDistance = Integer.MAX_VALUE;

        for (int vertex : distance.keySet()) {

            if (!visited.contains(vertex)
                    && distance.get(vertex) < minDistance) {

                minDistance = distance.get(vertex);

                minVertex = vertex;
            }
        }

        return minVertex;
    }
}