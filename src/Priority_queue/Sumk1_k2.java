package Priority_queue;

import java.util.*;

public class Sumk1_k2 {


    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        int k1=3;
        int k2=6;
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);

        //bruteforce

//        Collections.sort(arr);
//        int sum=0;
//        for(int i=k1;i<k2-1;i++){
//            sum+=arr.get(i);
//        }
//        System.out.println(sum);

        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<arr.size();i++){

            pq.add(arr.get(i));
            if(pq.size()>k2){
                pq.remove();
            }
        }
        pq.remove();

        int sum=0;
        while (pq.size()!=k1){
            sum+=pq.remove();

        }
        System.out.println(sum);

    }



}
