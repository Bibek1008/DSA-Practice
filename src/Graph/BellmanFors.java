package Graph;

import java.util.ArrayList;

public class BellmanFors {

    static  class  Edge{


        int weight;
        int src;
        int dest;

        Edge(int src,int dest,int weight){
            this.weight=weight;
            this.dest=dest;
            this.src=src;
        }
    }
    static void createGraph(ArrayList<Edge>[]graph, int v){

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));


        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-10));

    }
    static void Belmand(ArrayList<Edge> []graph,int src,int v){

        int []dist=new int[v];
        for(int i=0;i<v;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;

        for(int k=0;k<v-1;k++){

            for(int i=0;i<v;i++){

                for(int j=0;j<graph[i].size();j++){

                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int vt=e.dest;
                    //relaxation
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.weight<dist[vt]){
                        dist[vt]=dist[u]+e.weight;
                    }
                }
            }

        }

        //negative weight cycle

        for(int i=0;i<v;i++){

                for(int j=0;j<graph[i].size();j++){

                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int vt=e.dest;
                    //relaxation
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.weight<dist[vt]){
                        System.out.println("Negative weight cycle detected Bellmanford failed");
                        return;
                    }
                }
        }


        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();


    }


    public static void main(String[] args) {
        int v=5;

        ArrayList<Edge> []graph=new ArrayList[v];

        createGraph(graph,v);
        Belmand(graph,0,v);



    }

}
