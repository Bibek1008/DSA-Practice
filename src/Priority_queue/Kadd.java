package Priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Kadd {

    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        int k=3;
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        PriorityQueue<Integer>pq=new PriorityQueue<>(arr);

        for(int i=0;i<k;i++){

            int f=pq.remove();
            int g=pq.remove();
            pq.add(f*g);
        }
        int largest=Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            largest=Math.max(largest,pq.remove());
        }

        System.out.println(largest);


    }
}
