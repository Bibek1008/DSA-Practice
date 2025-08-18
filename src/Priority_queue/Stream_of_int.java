package Priority_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Stream_of_int {


    private static void add(PriorityQueue<Integer> leftpq, PriorityQueue<Integer> rightpq, int x) {
        // Step 1: Insert into left (max-heap) or right (min-heap)
        if (leftpq.isEmpty() || x <= leftpq.peek()) {
            leftpq.add(x);
        } else {
            rightpq.add(x);
        }

        // Step 2: Balance sizes so that leftpq has either the same size or one more than rightpq
        if (leftpq.size() > rightpq.size() + 1) {
            rightpq.add(leftpq.remove());
        } else if (rightpq.size() > leftpq.size()) {
            leftpq.add(rightpq.remove());
        }
    }



    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        int k1 = 3;
        int k2 = 6;
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);

        PriorityQueue<Integer> leftpq=new PriorityQueue<>(Comparator.reverseOrder());

        PriorityQueue<Integer> rightpq=new PriorityQueue<>();



    }
}
