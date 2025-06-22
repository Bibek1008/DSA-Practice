package _2D_array;

import java.util.Scanner;

public class Spiralorder {
    static int[][] input(int x, int y) {
        int[][] arr = new int[x][y];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Enter element of " + (i + 1) + " row");
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

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

    static void spiral(int arr[][]) {
        int row = arr.length;
        int column = arr[0].length;

        int toprow = 0, bottomrow = row - 1;
        int leftcolumn = 0, rightcolumn = column - 1;

        while (toprow <= bottomrow && leftcolumn <= rightcolumn) {
            for (int i = leftcolumn; i <= rightcolumn; i++) {
                System.out.print(arr[toprow][i] + " ");
            }
            toprow++;

            for (int i = toprow; i <= bottomrow; i++) {
                System.out.print(arr[i][rightcolumn] + " ");
            }
            rightcolumn--;

            if (toprow <= bottomrow) {
                for (int i = rightcolumn; i >= leftcolumn; i--) {
                    System.out.print(arr[bottomrow][i] + " ");
                }
                bottomrow--;
            }

            if (leftcolumn <= rightcolumn) {
                for (int i = bottomrow; i >= toprow; i--) {
                    System.out.print(arr[i][leftcolumn] + " ");
                }
                leftcolumn++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number & column number of the matrix: ");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();

        int arr[][] = input(row1, column1);
        System.out.println("The matrix given is:");
        printf(arr);
        System.out.println("The matrix in spiral order is:");
        spiral(arr);

        sc.close();
    }
}
