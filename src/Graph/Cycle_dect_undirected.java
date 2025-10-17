package Graph;


import java.util.ArrayList;

public class Cycle_dect_undirected {
    static class Edge{

        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[], int v){

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));


    }
    static boolean Cycle(ArrayList<Edge> graph[],boolean []vis,int curr,int parent){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);

            if(vis[e.dest]==true && e.dest!=parent){
                return true;
            }
            else if(!vis[e.dest]){

                if(Cycle(graph, vis, e.dest, curr)){
                    return true;
                }
            }


        }
        return false;

    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        boolean []vis=new boolean[v];


        createGraph(graph,v);
        boolean cycle_found=false;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (Cycle(graph, vis, i, -1)) {
                    cycle_found = true;
                    break;
                }
            }
        }

        System.out.println(cycle_found);






    }
}
