package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {

    // Edge class for the graph
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Pair class for the priority queue (edges considered for MST)
    static class Pair implements Comparable<Pair> {
        int src;
        int dest;
        int cost;

        Pair(int src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // min-heap based on cost
        }
    }

    // Create the graph
    static void createGraph(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // Prim's Algorithm
    static void primsAlgorithm(ArrayList<Edge>[] graph, int src, int v) {
        int mstCost = 0;
        boolean[] visited = new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Start from the source node
        pq.add(new Pair(-1, src, 0)); // -1 as src for first edge

        System.out.println("Edges in the MST:");

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.dest]) {
                visited[curr.dest] = true;
                mstCost += curr.cost;

                if (curr.src != -1) { // skip the first dummy edge
                    System.out.println(curr.src + " -> " + curr.dest + " @ " + curr.cost);
                }

                // Add neighbors to priority queue
                for (Edge e : graph[curr.dest]) {
                    if (!visited[e.dest]) {
                        pq.add(new Pair(e.src, e.dest, e.weight));
                    }
                }
            }
        }

        System.out.println("Total MST cost: " + mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph, v);
        primsAlgorithm(graph, 0, v);
    }
}
