package Heap;

import java.util.ArrayList;
import java.util.List;

public class Insertation_minheap {
    static void heapsort(List<Integer> arr) {
        // Step 1: Build a max heap
        heapifyMax(arr);

        // Step 2: Extract elements one by one
        for (int i = arr.size() - 1; i > 0; i--) {
            swap(arr, 0, i); // move max to end
            pushDownMaxHeap(arr, 0, i); // restore heap property on reduced heap
        }
    }

    static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    public static void heapifyMax(List<Integer> arr) {
        int lastInternalNode = (arr.size() / 2) - 1;
        for (int i = lastInternalNode; i >= 0; i--) {
            pushDownMaxHeap(arr, i, arr.size());
        }
    }

    private static void pushDownMaxHeap(List<Integer> heap, int i, int size) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int largest = i;

        if (left < size && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < size && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(heap, i, largest);
            pushDownMaxHeap(heap, largest, size);
        }
    }


    private static void push_down_in_minheap(List<Integer> heap, int i) {

        int n=heap.size()-1;
        if(i==n){
            return;
        }
        int left=(2*i)+1;
        int right=(2*i)+2;
        int smallest= i;
        if(left<=n && heap.get(left)<heap.get(smallest)){
            smallest=left;

        }
        if(right<=n && heap.get(right)<heap.get(smallest)){
            smallest=right;

        }
        if (smallest==i){
            return;
        }
        swap(heap,i,smallest);
        push_down_in_minheap(heap,smallest);

    }
    static void push_up_in_heap(List<Integer> heap,int i){

        //base copdition
        int parentidx=(i-1)/2;
        if(i==0 || heap.get(parentidx)>heap.get(i)){
            return;
        }
        swap(heap,i,parentidx);
        push_up_in_heap(heap,parentidx);

    }

    static  void insert(List<Integer> heap,int ele){

        heap.add(ele);
        int index=heap.size()-1;
        push_up_in_heap(heap,index);

    }
    static void deleteFromMinHeap(List<Integer>heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down_in_minheap(heap,0);
    }



//max heap
    static void deleteFromMaxHeap(List<Integer>heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down_in_maxheap(heap,0);
    }



    private static void push_down_in_maxheap(List<Integer> heap, int i) {

        int n=heap.size()-1;
        if(i==n){
            return;
        }
        int left=(2*i)+1;
        int right=(2*i)+2;
        int largest= i;
        if(left<=n && heap.get(left)>heap.get(largest)){
            largest=left;

        }
        if(right<=n && heap.get(right)>heap.get(largest)){
            largest=right;

        }
        if (largest==i){
            return;
        }
        swap(heap,i,largest);
        push_down_in_maxheap(heap,largest);

    }

    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);

        deleteFromMinHeap(heap);


    }
}
