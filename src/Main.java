public class Main {

    public static void main(String[] args) {

        Graph smallGraph = new Graph();

        // Create vertices

        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);

        // Add vertices

        smallGraph.addVertex(v0);
        smallGraph.addVertex(v1);
        smallGraph.addVertex(v2);
        smallGraph.addVertex(v3);
        smallGraph.addVertex(v4);
        smallGraph.addVertex(v5);
        smallGraph.addVertex(v6);
        smallGraph.addVertex(v7);
        smallGraph.addVertex(v8);
        smallGraph.addVertex(v9);

        // Add weighted edges

        smallGraph.addEdge(v0, v1, 4);
        smallGraph.addEdge(v0, v2, 2);

        smallGraph.addEdge(v1, v3, 5);
        smallGraph.addEdge(v1, v4, 1);

        smallGraph.addEdge(v2, v5, 3);
        smallGraph.addEdge(v2, v6, 6);

        smallGraph.addEdge(v3, v7, 2);

        smallGraph.addEdge(v4, v8, 7);

        smallGraph.addEdge(v5, v9, 4);

        System.out.println("Graph Structure:");

        smallGraph.printGraph();

        System.out.println("\nTraversals on small graph:");

        smallGraph.bfs(0);

        smallGraph.dfs(0);

        System.out.println("\nDijkstra Shortest Paths:");

        smallGraph.dijkstra(0);

        Experiment experiment = new Experiment();

        experiment.runMultipleTests();

        experiment.printResults();
    }
}