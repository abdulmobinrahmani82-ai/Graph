 Graph Traversal and Representation System with Dijkstra Algorithm
 
Name:
Abdul Mobin Rahmani

 Group
IT-2503

 A. Project Overview

This project implements a graph system using Java.

A graph is a data structure made of:

- Vertices (nodes): represent entities
- Edges (connections): represent relationships between vertices

The graph is implemented using an Adjacency List structure for efficient storage and traversal.

The project includes the following graph algorithms:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Dijkstra’s Shortest Path Algorithm (Bonus Task)

The bonus task extends the graph to support weighted edges and shortest path calculation.


 B. Class Descriptions

 1. Vertex Class

Represents a node in the graph.

 Field

- `id` : unique identifier

### Methods

- Constructor
- `getId()`
- `toString()`

 2. Edge Class

Represents a weighted connection between two vertices.

 Fields

- `source` : starting vertex
- `destination` : ending vertex
- `weight` : edge cost/distance

### Methods

- Constructor
- Getters
- `toString()`

---

 3. Graph Class

Represents the graph using an adjacency list.

 Data Structure

java
Map<Integer, List<Edge>>

Methods
addVertex(Vertex v)
addEdge(Vertex source, Vertex destination, int weight)
printGraph()
bfs(int start)
dfs(int start)
dijkstra(int start)

C. Adjacency List Explanation

Each vertex stores a list of connected weighted edges.
C. Adjacency List Explanation

Example:
0 -> 1(4) 2(2)
1 -> 3(5) 4(1)

This means:

Vertex 0 connects to Vertex 1 with weight 4
Vertex 0 connects to Vertex 2 with weight 2
Vertex 1 connects to Vertex 3 with weight 5


D. Algorithm Descriptions
1. Breadth-First Search (BFS)
Steps
Start from a node
Add it to a queue
Visit all neighbors
Continue level by level
Characteristics
Uses Queue
Explores layer by layer
Time Complexity

O(V+E)

Use Cases
Finding shortest path in unweighted graphs
Level-order traversal


2. Depth-First Search (DFS)
Steps
Start from a node
Visit it
Go as deep as possible
Backtrack when needed
Characteristics
Uses Recursion (Stack)
Explores deeply first
Time Complexity

O(V+E)

Use Cases
Detecting cycles
Path finding
Topological sorting

3. Dijkstra’s Algorithm (Bonus Task)

Dijkstra’s Algorithm finds the shortest path from one starting vertex to all other vertices in a weighted graph.

Features
Supports weighted graphs
Calculates minimum distances
Uses adjacency list representation
Uses visited nodes and distance tracking
Steps
Initialize all distances as infinity
Set start vertex distance to 0
Select the unvisited vertex with minimum distance
Update neighboring distances
Repeat until all vertices are visited
Time Complexity

O(V^2)

Example Output:

Shortest distances from vertex 0

To 0 = 0
To 1 = 4
To 2 = 2
To 3 = 9
To 4 = 5


E. Experimental Results
Execution Time Table
| Graph Size | BFS Time (ns) | DFS Time (ns) | Dijkstra Time (ns) |
| ---------- | ------------- | ------------- | ------------------ |
| 10         | 693600        | 650400        | 875700             |
| 30         | 1171400       | 906300        | 2088700            |
| 100        | 5528200       | 4218700       | 9885100            |


F. Observations
As graph size increases, execution time increases.
BFS and DFS show linear growth.
Dijkstra takes more time because it calculates shortest paths using weighted edges.
DFS is sometimes slightly faster due to recursive traversal.
Weighted graphs require additional computations compared to unweighted graphs.

Graph Structure
0 -> 1(4) 2(2)
1 -> 3(5) 4(1)
2 -> 5(3) 6(6)

BFS: 0 1 2 3 4 5 6 7 8 9
DFS: 0 1 3 7 4 8 2 5 9 6

Dijkstra Shortest Paths
Shortest distances from vertex 0

To 0 = 0
To 1 = 4
To 2 = 2
To 3 = 9
To 4 = 5
To 5 = 5
To 6 = 8
To 7 = 11
To 8 = 12
To 9 = 9

G. Screenshots
Graph Structure Output
<img width="596" height="251" alt="image" src="https://github.com/user-attachments/assets/e52f2286-3439-46ce-a916-8f3ecab65bc8" />

DFS & BFS Traversal Output:
<img width="434" height="97" alt="image" src="https://github.com/user-attachments/assets/f613aab9-96f9-4816-aaf5-d60396c03d03" />


<img width="491" height="370" alt="image" src="https://github.com/user-attachments/assets/532d8b74-1785-4fbf-a166-b2b9b0e742cd" />

H. Analysis Questions
1. How does graph size affect BFS and DFS performance?

As graph size increases, traversal algorithms require more processing time because more vertices and edges are visited.

2. Which traversal is faster?

BFS and DFS usually have similar performance. DFS may sometimes be slightly faster because recursion can reduce queue operations.

3. Do results match theoretical complexity?

Yes. The results follow:

BFS → O(V + E)
DFS → O(V + E)
Dijkstra → O(V²)

because each algorithm processes vertices and edges systematically.

4. How does graph structure affect traversal order?

Traversal order depends on how vertices are connected.

Tree-like graphs produce predictable traversals
Complex graphs may produce different orders

5. When is BFS preferred over DFS?

BFS is preferred for:

Shortest path in unweighted graphs
Level-based traversal problems
6. What are the limitations of DFS?
Can go very deep
Risk of stack overflow
Does not guarantee shortest path
7. Why is Dijkstra useful?

Dijkstra’s Algorithm is useful for finding shortest paths in weighted graphs such as:

GPS navigation
Network routing
Transportation systems
I. Reflection

In this project, I learned how graph data structures work and how graph traversal algorithms are implemented using Java.

I understood the differences between BFS, DFS, and Dijkstra’s Algorithm.

One challenge was modifying the graph from an unweighted structure to a weighted graph while keeping BFS and DFS functional.

Another challenge was implementing shortest path calculations correctly using distance updates and visited nodes.

This project improved my understanding of:

Graph representations
Traversal algorithms
Weighted graphs
Shortest path algorithms
Algorithm performance analysis

assignment3-graphs/
├── src/
│   ├── Vertex.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── Experiment.java
│   └── Main.java
├── docs/
│   ├── screenshots/
│   └── diagrams/
├── README.md
└── .gitignore


