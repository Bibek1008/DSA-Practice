package Graph;

import java.util.ArrayList;

public class Cycle_detection_directed {

    static class Edge{

        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[],int v){

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));


    }
    static boolean cycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean stack[]){

        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){

            Edge e=graph[curr].get(i);

            if(stack[e.dest]){
                return true;
            } else if (!vis[e.dest]) {

                if(cycle(graph, vis,e.dest, stack)){
                    return true;
                }
                
            }

        }
        stack[curr]=false;


        return false;

    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        boolean []vis=new boolean[v];
        boolean []stack =new boolean[v];
        createGraph(graph,v);

        for (int i=0;i<v;i++){
            if(!vis[i]){
                boolean x=cycle(graph,vis,i,stack);

                if(x){
                    System.out.println(x);
                    break;
                }
            }
        }




    }
}
