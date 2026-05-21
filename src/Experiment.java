public class Experiment {

    public void runTraversals(Graph g, int start) {

        long startTime, endTime;

        // BFS

        startTime = System.nanoTime();

        g.bfs(start);

        endTime = System.nanoTime();

        long bfsTime = endTime - startTime;

        // DFS

        startTime = System.nanoTime();

        g.dfs(start);

        endTime = System.nanoTime();

        long dfsTime = endTime - startTime;

        // Dijkstra

        startTime = System.nanoTime();

        g.dijkstra(start);

        endTime = System.nanoTime();

        long dijkstraTime = endTime - startTime;

        // Results

        System.out.println("BFS Time: " + bfsTime + " ns");

        System.out.println("DFS Time: " + dfsTime + " ns");

        System.out.println("Dijkstra Time: "
                + dijkstraTime + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\nGraph Size: " + size);

            Graph g = new Graph();

            Vertex[] vertices = new Vertex[size];

            // create vertices

            for (int i = 0; i < size; i++) {

                vertices[i] = new Vertex(i);

                g.addVertex(vertices[i]);
            }

            // create weighted edges

            for (int i = 0; i < size - 1; i++) {

                int weight = (i % 5) + 1;

                g.addEdge(
                        vertices[i],
                        vertices[i + 1],
                        weight);
            }

            runTraversals(g, 0);
        }
    }

    public void printResults() {

        System.out.println(
                "\nExperiments completed successfully.");
    }
}