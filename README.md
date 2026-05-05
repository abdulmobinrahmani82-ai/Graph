Graph Traversal and Representation System
Name: Abdul mobin Rahmani 
Group: IT-2503

A. Project Overview

This project implements a graph system using Java. A graph is a data structure made of:

Vertices nodes: represent entities
Edges (connections): represent relationships between vertices

In this project, the graph is implemented using an Adjacency List, which efficiently stores connections between vertices.


Two important graph traversal algorithms are implemented:

Breadth-First Search (BFS) → explores level by level
Depth-First Search (DFS) → explores as deep as possible first


 B. Class Descriptions

1. Vertex Class

Represents a node in the graph.

 Field:

 id : unique identifier
Methods:

Constructor
Getter (`getId()`)
`toString()`


 2. Edge Class

Represents a connection between two vertices.

 Fields:

 source: starting vertex
destination : ending vertex
 Methods:

  * Constructor
  * Getters
  * toString()


 3. Graph Class

Represents the graph using an Adjacency List

 Data Structure:

`Map<Integer, List<Integer>>`

 Methods:

  * addVertex(Vertex v)
  * addEdge(int from, int to)
  * printGraph()
  * bfs(int start)
  * dfs(int start)


 Adjacency List Explanation

Each vertex stores a list of its neighbors.

Example:

0 -> 1 2
1 -> 3 4


This means:

Vertex 0 is connected to 1 and 2
 Vertex 1 is connected to 3 and 4

 C. Algorithm Descriptions

1. Breadth-First Search (BFS)

 Steps:

1. Start from a node
2. Add it to a queue
3. Visit all neighbors
4. Continue level by level

 Characteristics:

* Uses Queue
* Explores layer by layer

 Time Complexity:

* O(V + E)

 Use Cases:

* Finding shortest path in unweighted graphs
* Level-order traversal


 2. Depth-First Search (DFS)

 Steps:

1. Start from a node
2. Visit it
3. Go as deep as possible
4. Backtrack when needed

 Characteristics:

* Uses Recursion (Stack)
* Explores deeply first

 Time Complexity:

* O(V + E)

 Use Cases:

* Detecting cycles
* Path finding
* Topological sorting


 D. Experimental Results
Execution Time Table

| Graph Size | BFS Time (ns) | DFS Time (ns) |
| ---------- | ------------- | ------------- |
| 10         |               |               |
| 30         |               |               |
| 100        |               |               |

 Observations

* As the graph size increases, execution time also increases.
* Both BFS and DFS show linear growth based on nodes and edges.
* The difference between BFS and DFS time is usually small.

 E. Screenshots

 Graph Structure Output
<img width="622" height="356" alt="image" src="https://github.com/user-attachments/assets/e4c83cdc-058d-4936-81af-d9bb4753be53" />

 BFS Traversal Output
<img width="385" height="109" alt="image" src="https://github.com/user-attachments/assets/2d9549b1-78f9-45e0-b52f-4122e880fb98" />

 DFS Traversal Output
<img width="385" height="109" alt="image" src="https://github.com/user-attachments/assets/2d9549b1-78f9-45e0-b52f-4122e880fb98" />

 Performance Results
<img width="1262" height="332" alt="image" src="https://github.com/user-attachments/assets/7571fd9e-2640-40eb-9144-eb51c4a19a90" />


 F. Analysis Questions

 1. How does graph size affect BFS and DFS performance?

As the graph size increases, both BFS and DFS take more time. This is because they must visit more vertices and edges.



2. Which traversal is faster?
In most cases, BFS and DFS have similar performance. Sometimes BFS may be slightly slower due to queue operations, while DFS may be faster due to recursion.


 3. Do results match O(V + E)?
Yes, the results follow **O(V + E)** complexity because both algorithms visit each vertex and edge once.


 4. How does graph structure affect traversal order?
The structure of the graph changes the order of traversal. For example:
* In a tree-like graph → traversal is predictable
* In a complex graph → traversal order varies


 5. When is BFS preferred over DFS?
BFS is preferred when:
* Finding the shortest path
* Working with level-based problems


 6. What are the limitations of DFS?
* Can go very deep (stack overflow risk)
* Does not guarantee shortest path
* May be inefficient for large graphs


 G. Reflection

In this project, I learned how graphs work and how to implement them using adjacency lists. I also understood the difference between BFS and DFS algorithms.

BFS explores nodes level by level, while DFS goes deep into one path first. Implementing both algorithms helped me understand their behavior and performance.

One challenge I faced was managing visited nodes correctly and ensuring that the traversal does not repeat nodes. Another challenge was understanding how recursion works in DFS.

Overall, this project improved my understanding of graph algorithms and their real-world applications.


 H. Project Structure


assignment3-graphs/
├── src/
│   ├── Vertex.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── Experiment.java
│   └── Main.java
├── docs/
│   ├── screenshots/
│   └── diagrams
├── README.md
└── .gitignore
