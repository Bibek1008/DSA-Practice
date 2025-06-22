package BinarySearch;

public class SquareRoot {
    static int squareRoot(int x) {
        if (x == 0 || x == 1) return x; // Base case

        int start = 0, end = x;
        int ans = -1;

        while (start <= end) { // Fix loop condition
            int mid = start + (end - start) / 2;
            long val = (long) mid * mid; // Use long to avoid overflow

            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid; // Store potential answer
                start = mid + 1;
            } else {
                end = mid - 1; // Fix end update
            }
        }
        return ans; // Returns the integer part of sqrt(x)
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(5));  // Output: 2
        System.out.println(squareRoot(16)); // Output: 4
        System.out.println(squareRoot(1));  // Output: 1
        System.out.println(squareRoot(0));  // Output: 0
    }
}
