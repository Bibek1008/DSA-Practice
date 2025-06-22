package _2D_array;

import java.util.Scanner;

public class PrefixSumInCoordinate {

    // Input method to fill the matrix
    static int[][] input(int x, int y) {
        int[][] arr = new int[x][y];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Method to print the matrix
    static void printMatrix(int arr[][]) {
        int x = arr.length;
        int y = arr[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method 1: Brute force approach to find the sum
    static int prefixSum(int arr[][], int x1, int y1, int x2, int y2) {
        int ans = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                ans += arr[i][j];
            }
        }
        return ans;
    }

    // Method to preprocess the matrix for prefix sum (in-place modification)
    static void preprocessMatrix(int arr[][]) {
        int x = arr.length;
        int y = arr[0].length;

        // Calculate row-wise prefix sums
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < y; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // Calculate column-wise prefix sums
        for (int j = 0; j < y; j++) {
            for (int i = 1; i < x; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    // Optimized sum calculation using preprocessed matrix with if-else conditions
    static int findSum(int arr[][], int x1, int y1, int x2, int y2) {
        preprocessMatrix(arr);

        int total = arr[x2][y2];
        int up = 0;
        int left = 0;
        int upLeft = 0;

        // Using if-else instead of conditional operator for boundary checks
        if (x1 > 0) {
            up = arr[x1 - 1][y2];
        } else {
            up = 0;
        }

        if (y1 > 0) {
            left = arr[x2][y1 - 1];
        } else {
            left = 0;
        }

        if (x1 > 0 && y1 > 0) {
            upLeft = arr[x1 - 1][y1 - 1];
        } else {
            upLeft = 0;
        }

        return total - up - left + upLeft;
    }

    //approach 2

    static void inplace(int arr[][]){

        int x=arr.length;
        int y=arr[0].length;
        for(int i=0;i<x;i++){
            for(int j=1;j<y;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    static int sum(int arr[][],int r1,int c1,int r2,int c2){
        int ans=0;
        inplace(arr);
        for (int i=r1;i<=r2;i++){
            if(c1>0) {
                ans += arr[i][c2] - arr[i][c1 - 1];
            }
            else{
                ans+=arr[i][c2];
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Input matrix
        int arr[][] = input(rows, columns);

        // Input coordinates for the submatrix sum
        System.out.println("Enter the starting row and column (x1, y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the ending row and column (x2, y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Printing the matrix
        System.out.println("The matrix is:");
        printMatrix(arr);



        // Method 1: Brute force approach
        System.out.println("Sum using brute force: " + prefixSum(arr, x1, y1, x2, y2));

        // Method 3: Optimized sum with preprocessed prefix sums
        System.out.println("Sum using optimized approach: " + findSum(arr, x1, y1, x2, y2));

        //method 2 printing if we used this method then there is shallow copy so we need to fix this issue

       // System.out.println("Sum using approach 2 is "+sum(arr, x1, y1, x2, y2));

        sc.close();
    }
}
