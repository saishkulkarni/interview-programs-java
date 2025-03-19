package general;

import java.util.*;

/**
 * This program finds the farthest nodes in an undirected graph given an edge list.
 *
 * Problem Statement:
 * Given a list of edges in the form of "node1-node2", we need to determine the
 * two farthest nodes in the graph. The distance between two nodes is measured
 * by the number of edges in the shortest path between them.
 *
 * Approach:
 * 1. Parse the edges and construct an adjacency list.
 * 2. Use Breadth-First Search (BFS) from an arbitrary node to find the farthest node.
 * 3. Perform BFS again from that farthest node to determine the maximum distance.
 * 4. The two nodes found in the second BFS are the farthest nodes.
 *
 * Example:
 * Input: ["b-e", "b-c", "c-d", "a-b", "e-f"]
 * Graph:
 *       a
 *       |
 *       b -- e -- f
 *       |
 *       c
 *       |
 *       d
 * Output: Farthest Nodes: (a, f) or (d, f)
 */

public class FarthestNodes {

	/**
	 * Builds an adjacency list from the given edge list.
	 * @param edges Array of edges in "node1-node2" format.
	 * @return Adjacency list representation of the graph.
	 */
	public static Map<String, List<String>> buildGraph(String[] edges) {
		Map<String, List<String>> graph = new HashMap<>();

		for (String edge : edges) {
			String[] nodes = edge.split("-");
			String node1 = nodes[0];
			String node2 = nodes[1];

			graph.putIfAbsent(node1, new ArrayList<>());
			graph.putIfAbsent(node2, new ArrayList<>());

			graph.get(node1).add(node2);
			graph.get(node2).add(node1);
		}
		return graph;
	}

	/**
	 * Performs BFS to find the farthest node and its distance from the start node.
	 * @param graph The adjacency list representation of the graph.
	 * @param start The starting node for BFS.
	 * @return A pair (farthestNode, distance).
	 */
	public static Map.Entry<String, Integer> bfsFarthestNode(Map<String, List<String>> graph, String start) {
		Queue<String> queue = new LinkedList<>();
		Map<String, Integer> distances = new HashMap<>();
		queue.add(start);
		distances.put(start, 0);

		String farthestNode = start;
		int maxDistance = 0;

		while (!queue.isEmpty()) {
			String node = queue.poll();
			int currentDistance = distances.get(node);

			for (String neighbor : graph.get(node)) {
				if (!distances.containsKey(neighbor)) { // Not visited yet
					distances.put(neighbor, currentDistance + 1);
					queue.add(neighbor);
					if (currentDistance + 1 > maxDistance) {
						maxDistance = currentDistance + 1;
						farthestNode = neighbor;
					}
				}
			}
		}

		return Map.entry(farthestNode, maxDistance);
	}

	public static void main(String[] args) {
		String[] edges = { "b-e", "b-c", "c-d", "a-b", "e-f" };

		// Step 1: Build graph
		Map<String, List<String>> graph = buildGraph(edges);

		// Step 2: Pick an arbitrary node (first in the list)
		String startNode = edges[0].split("-")[0];

		// Step 3: First BFS to find farthest node from startNode
		String farthestFromStart = bfsFarthestNode(graph, startNode).getKey();

		// Step 4: Second BFS from the farthest node found to get the true farthest node
		Map.Entry<String, Integer> result = bfsFarthestNode(graph, farthestFromStart);

		System.out.println("Farthest Nodes: (" + farthestFromStart + ", " + result.getKey() + ")");
		System.out.println("Max Distance: " + result.getValue());
	}
}
