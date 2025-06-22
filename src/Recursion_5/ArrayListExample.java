package Recursion_5;

import java.util.ArrayList;

public class ArrayListExample {

    static ArrayList<Integer> allindex(int arr[], int target, int index, int n) {
        // Base case: if the index reaches the length of the array, return an empty ArrayList.
        if (index >= n) {
            return new ArrayList<Integer>();
        }

        // Create a new ArrayList to store indices.
        ArrayList<Integer> ans = new ArrayList<>();

        // If the current element equals the target, add its index.
        if (arr[index] == target) {
            ans.add(index);
        }

        // Recursively get the indices from the rest of the array (increment the index).
        ArrayList<Integer> smallans = allindex(arr, target, index + 1, n);

        // Add all indices from the recursive call to the current answer list.
        ans.addAll(smallans);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,4,4,4,4};
        int target = 4;
        int n = a.length;

        // Use the correct ArrayList type from java.util
        ArrayList<Integer> ans = allindex(a, target, 0, n);

        // Print all found indices
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
