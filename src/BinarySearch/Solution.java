package BinarySearch;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        // Treat the 2D matrix as a sorted 1D array
        int start = 0, end = m * n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // Convert the 1D index back to 2D coordinates
            int midValue = matrix[mid / n][mid % n];

            if (midValue == target) {
                return true; // Found the target
            } else if (midValue < target) {
                start = mid + 1; // Move right in the 1D view
            } else {
                end = mid - 1;   // Move left in the 1D view
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        // Sample matrix (sorted in a row-wise manner)
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Example targets to search for
        int target1 = 3;
        int target2 = 13;

        Solution sol = new Solution();

        // Test search for target1
        boolean result1 = sol.searchMatrix(matrix, target1);
        System.out.println("Searching for " + target1 + ": " + (result1 ? "Found" : "Not Found"));

        // Test search for target2
        boolean result2 = sol.searchMatrix(matrix, target2);
        System.out.println("Searching for " + target2 + ": " + (result2 ? "Found" : "Not Found"));
    }
}

