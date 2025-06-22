package _2D_array;

import java.util.Scanner;

public class Filling_in_spiralorder {
    static void printf(int arr[][]) {
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

    static int[][] spiral(int n) {
        int arr[][]=new int[n][n];
        int row = arr.length;
        int column = arr[0].length;

        int toprow = 0, bottomrow = row - 1;
        int leftcolumn = 0, rightcolumn = column - 1;
        int p=1;
        while (toprow <= bottomrow && leftcolumn <= rightcolumn) {
            for (int i = leftcolumn; i <= rightcolumn; i++) {
                arr[toprow][i] =p++;


            }
            toprow++;

            for (int i = toprow; i <= bottomrow; i++) {
                arr[i][rightcolumn]=p++;
            }
            rightcolumn--;

            if (toprow <= bottomrow) {
                for (int i = rightcolumn; i >= leftcolumn; i--) {
                    arr[bottomrow][i]=p++;
                }
                bottomrow--;
            }

            if (leftcolumn <= rightcolumn) {
                for (int i = bottomrow; i >= toprow; i--) {
                    arr[i][leftcolumn]=p++;
                }
                leftcolumn++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int arr[][]=spiral(n);


        System.out.println("The matrix in spiral order is:");
        printf(arr);

        sc.close();
    }
}
