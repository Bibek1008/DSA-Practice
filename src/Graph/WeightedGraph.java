package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WeightedGraph {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2, 2));
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    static void bfs(ArrayList<Edge>[] graph, int v, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true; // mark as visited when adding to queue

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true; // mark visited immediately
                }
            }
        }
    }

    static void dfs(ArrayList<Edge>[] graph,boolean[]vis,int curr){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){

            Edge e=graph[curr].get(i);

            if(vis[e.dest]==false){
                dfs(graph,vis,e.dest);
            }
        }

    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        System.out.println("This is graph BFS traversal:");
        boolean[] vis = new boolean[v];

//        for (int i = 0; i < v; i++) {
//            if (!vis[i]) {
//                bfs(graph, v, vis, i);
//                System.out.println(); // separates disconnected components
//            }
//        }
        System.out.println("This is Dfs search");
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, vis,i);
                System.out.println(); // separates disconnected components
            }
        }



        System.out.println("\nNeighbours of vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " (weight = " + e.weight + ")");
        }
    }
}
