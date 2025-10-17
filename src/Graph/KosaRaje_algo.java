package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosaRaje_algo {

        static class Edge {
            int src;
            int dest;


            Edge(int src, int dest) {
                this.src = src;
                this.dest = dest;

            }
        }

        static void createGraph(ArrayList<Edge>[] graph, int v) {
            for (int i = 0; i < v; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 2));
            graph[0].add(new Edge(0,3));


            graph[1].add(new Edge(1, 0));


            graph[2].add(new Edge(2, 1));


            graph[3].add(new Edge(3, 4));

        }

        static void Topological_sort(ArrayList<Edge> graph[],boolean []vis,int curr,Stack<Integer> s) {

            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {

                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    Topological_sort(graph, vis, e.dest, s);
                }
            }
            s.push(curr);
        }

    static void dfs_m(ArrayList<Edge>[] graph,boolean vis[],int curr){

        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]) {

                dfs_m(graph, vis, e.dest );

            }

        }


    }

        static void Kosaraju(ArrayList<Edge>[]graph,int v){

            Stack<Integer>s=new Stack<>();
            boolean []vis=new boolean[v];
            //including in stack in topo sort
            for(int i=0;i<v;i++){
                if(!vis[i]){
                    Topological_sort(graph,vis,i,s);
                }
            }
            //transpose graph
            ArrayList<Edge>[]trans=new ArrayList[v];
            for (int i = 0; i < v; i++) {
                trans[i] = new ArrayList<>();
            }

            for(int i=0;i<v;i++){

                for(int j=0;j<graph[i].size();j++){

                    Edge e=graph[i].get(j);
                    trans[e.dest].add(new Edge(e.dest,e.src));

                }
            }
            //  dfs in stack
            vis=new boolean[v];
            while (!s.isEmpty()){
                int curr=s.pop();
                if(!vis[curr]){
                    dfs_m(trans,vis,curr);
                    System.out.println();
                }

            }


        }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[]graph=new ArrayList[v];

        createGraph(graph,v);
        Kosaraju(graph,v);




    }



}
