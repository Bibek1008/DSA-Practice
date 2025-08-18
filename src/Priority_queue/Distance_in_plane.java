package Priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Distance_in_plane {

    private static class point{
        int x;
        int y;
        int dis;
    }
    private static class point_comprator implements Comparator<point>{

        public int compare(point p1,point p2){

            if(p1.dis>p2.dis){
                return 1;
            } else if (p1.dis<p2.dis) {
                return -1;

            }
            else{
                return 0;
            }

        }

    }


    public static void main(String[] args) {

        PriorityQueue<point> pq=new PriorityQueue<>(new point_comprator());

    }
}
