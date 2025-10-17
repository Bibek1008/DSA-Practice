package Graph;

import java.util.ArrayList;

public class Articulation_point {
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
    static void Tarjon(ArrayList<Edge> []graph,int curr,int []dt,int []low,int []time,int parent,boolean []vis,boolean []ap){

        vis[curr]=true;
        dt[curr]=low[curr]=++time[0];
        int children=0;
        for(int i=0;i<graph[curr].size();i++){

            Edge e=graph[curr].get(i);
            int neigh=e.dest;

            if(parent==neigh){
                continue;
            } else if (vis[neigh]) {
                low[curr]=Math.min(low[curr],dt[neigh]);

                
            }
            else {
                Tarjon(graph, neigh, dt, low, time, curr, vis, ap);
                low[curr]=Math.min(low[curr],low[neigh]);

                if(dt[curr]<=low[neigh] && parent!=-1){
                    ap[curr]=true;
                }
                children++;
            }

        }
        if(parent==-1 && children>1){
            ap[curr]=true;
        }

    }

    static void get_Ap(ArrayList<Edge> []graph,int v){

        int []dt=new int[v];
        int []low=new int[v];
        int []time={0};

        boolean []vis=new boolean[v];
        boolean []ap=new boolean[v];

        for(int i=0;i<v;i++){

            if(!vis[i]){
                Tarjon(graph,i,dt,low,time,-1,vis,ap);
            }
        }

        for(int i=0;i<v;i++){
            if(ap[i]){
                System.out.println("Articulation point "+i);
            }
        }

    }


    public static void main(String[] args) {
        int v=5;

        ArrayList<Edge> []graph=new ArrayList[v];
        createGraph(graph,v);
        get_Ap(graph,v);
    }
}
