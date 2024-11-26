# Practice Problem 2: Graph Traversal and Path Finding

### Task:
Write pseudocode to find the shortest path between two nodes in a **weighted graph** using **Dijkstra's Algorithm**.

Read about [**Dijkstra's Algorithm**](https://www.javatpoint.com/dijkstras-algorithm)

### Problem Details:
You are given a weighted graph where each node represents a location, and each edge between nodes represents a path with a weight (cost of travel). Your task is to find the shortest path from a given **start node** to a **target node**.

The graph is represented as an adjacency list, and you need to calculate the minimum cost to travel from the start node to the target node. If no path exists, output "No path found."

**Inputs:**
1. A weighted graph represented as an adjacency list:
   - Each node in the graph has a list of its neighboring nodes with associated edge weights (costs).
   - Example: `A -> [(B, 4), (C, 2)]` means node `A` is connected to `B` with weight 4 and `C` with weight 2.
2. A start node and a target node.

**Outputs:**
- The shortest path from the start node to the target node, along with the total travel cost (sum of edge weights).
- If no path exists, output: "No path found."

### Example:
- Input:
  - Graph: 
    ```plaintext
    A -> [(B, 4), (C, 2)]
    B -> [(C, 5), (D, 10)]
    C -> [(D, 3)]
    D -> []
    ```
  - Start node: `A`
  - Target node: `D`
- Output:
  - Shortest path: `A -> C -> D`
  - Cost: `5`