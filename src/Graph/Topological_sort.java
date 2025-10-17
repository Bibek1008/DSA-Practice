package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_sort {
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
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));


    }
    static void Topological_sort(ArrayList<Edge> graph[],boolean []vis,int curr,Stack<Integer> s){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){

            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                Topological_sort(graph, vis, e.dest, s);
            }
        }
        s.push(curr);

    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        boolean []vis=new boolean[v];

        Stack<Integer> s=new Stack<>();
        createGraph(graph,v);

        for (int i=0;i<v;i++){
            if(!vis[i]){

                Topological_sort(graph,vis,i,s);
            }
        }

        // poping element from stack

        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }




    }
}
