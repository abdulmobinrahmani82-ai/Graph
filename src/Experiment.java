public class Experiment {

    public void runTraversals(Graph g, int start) {

        long startTime, endTime;


        startTime = System.nanoTime();
        g.bfs(start);
        endTime = System.nanoTime();
        long bfsTime = endTime - startTime;

        startTime = System.nanoTime();
        g.dfs(start);
        endTime = System.nanoTime();
        long dfsTime = endTime - startTime;

        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\nGraph Size: " + size);

            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }

            runTraversals(g, 0);
        }
    }

    public void printResults() {
        System.out.println("\nExperiments completed successfully.");
    }
}
