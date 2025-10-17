package Graph;
import java.util.*;



public class Tarjan_Algo {

    static  class  Edge{
        int src;
        int dest;

        Edge(int src,int dest){

            this.dest=dest;
            this.src=src;
        }
    }
    static void createGraph(ArrayList<Edge>[]graph, int v){

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        // Graph from the image:
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    static void dfs(ArrayList<Edge> []graph,int curr,boolean []vis,int []dt,int []low,int[] time,int parent){

        vis[curr]=true;
        dt[curr]=low[curr]=++time[0];
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            
            if(e.dest==parent){
                continue;
            } else if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, dt, low, time, curr);

                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.print("The bridge is found ");
                    System.out.println(curr+"--->"+e.dest);
                }
            }
            else{
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }

    }

    static void getBridge(ArrayList<Edge> []graph,int v){

        int []dt=new int[v];
        int []low=new int[v];
        boolean []vis=new boolean[v];

        int []time={0};
        for (int i=0;i<v;i++){

            if(!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);
            }
        }
    }


    public static void main(String[] args) {
        int v=5;

        ArrayList<Edge> []graph=new ArrayList[v];

        createGraph(graph,v);
        getBridge(graph,v);




    }


}
