package Graph;
import java.util.ArrayList;
public class All_Path {

    static class Edge{

        int scr;
        int dest;
        int weight;

        Edge(int src,int dest,int weight){
            this.scr=src;
            this.dest=dest;
            this.weight=weight;

        }

    }
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected edges
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));
    }
    //function to print all path

    static void dfs_m(ArrayList<Edge>[] graph,boolean vis[],int curr,int dest,String path){

        if(curr==dest){
            System.out.println(path);
            return;

        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            vis[curr]=true;
            if(vis[e.dest]==false) {

                dfs_m(graph, vis, e.dest, dest, path + e.dest);

            }
            vis[curr]=false;//backtracking
        }


    }


    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];
        boolean vis[]=new boolean[v];
        int src=0;
        int dest=5;
        createGraph(graph);
        dfs_m(graph,vis,0,5,"0");



    }
}
