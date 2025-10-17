//package Graph;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//
//public class DijkshatraAlgo {
//
//
//
//    static  class  Edge{
//
//
//        int weight;
//        int src;
//        int dest;
//
//        Edge(int src,int dest,int weight){
//            this.weight=weight;
//            this.dest=dest;
//            this.src=src;
//        }
//    }
//
//    static void createGraph(ArrayList<Edge> []graph,int v){
//
//        for(int i=0;i<v;i++){
//            graph[i]=new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0,1,2));
//        graph[0].add(new Edge(0,2,4));
//
//        graph[1].add(new Edge(1,3,7));
//        graph[1].add(new Edge(1,2,1));
//
//        graph[2].add(new Edge(2,4,3));
//
//        graph[3].add(new Edge(3,5,1));
//
//        graph[4].add(new Edge(4,3,2));
//        graph[4].add(new Edge(4,5,5));
//    }
//
//    static  class pair implements Comparable<pair>{
//
//        int node;
//        int dist;
//
//        pair(int node,int dist){
//            this.node=node;
//            this.dist=dist;
//        }
//        public int compareTo(pair p2){
//            return this.dist-p2.dist;
//        }
//
//
//    }
//
//    static void Dij(ArrayList<Edge> []graph,int src,int v){
//        PriorityQueue<pair> pq=new PriorityQueue<>();
//        int []dist=new int[v];
//
//        boolean []visit=new boolean[v];
//
//        for(int i=0;i<v;i++){
//
//            dist[i] = Integer.MAX_VALUE;
//
//        }
//        dist[src]=0;
//        pq.add(new pair(src,0));
//
//        //bfs
//
//        while (!pq.isEmpty()){
//            pair curr=pq.remove();//shortest dist pair
//
//            if(!visit[curr.node]){
//                visit[curr.node]=true;
//
//                for(int i=0;i<graph[curr.node].size();i++){
//
//                    Edge e=graph[curr.node].get(i);
//                    int u=e.src;
//                    int vt=e.dest;
//
//                    //relaxation
//                    if(dist[u]+e.weight<dist[vt]){
//                        dist[vt]=dist[u]+e.weight;
//                        pq.add(new pair(vt,dist[vt]));
//
//                    }
//                }
//            }
//        }
//        for(int i:dist){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//
//    }
//
//
//    public static void main(String[] args) {
//        int v=6;
//
//        ArrayList<Edge> []graph=new ArrayList[v];
//
//        createGraph(graph,v);
//        Dij(graph,0,v);
//
//
//    }
//}
////tc O(e+elogv)