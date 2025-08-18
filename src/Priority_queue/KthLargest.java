package Priority_queue;

import java.util.*;

public class KthLargest {





    public static void main(String[] args) {

        List<Integer>arr=new ArrayList<>();
        int k=3;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        List<Integer> sorted=new ArrayList<>(arr);
        sorted.sort(Comparator.reverseOrder());

        System.out.println(sorted.get(k-1));
        //Better approach
        System.out.println("from priority q");
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num); // add current number
            if (pq.size() > k) { // keep only k largest elements
                pq.poll(); // remove smallest
            }
        }

        System.out.println(pq.peek()); // root will be kth largest
    }



}
