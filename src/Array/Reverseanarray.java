package Array;

import java.util.Scanner;

public class Reverseanarray {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void inplace(int arr[]) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        printf(arr);
    }

    static void printf(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] x = new int[num];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x[j] = arr[i];
            j++;
        }

        System.out.println("The original array is ");
        printf(arr);

        System.out.println("Array after reverse (new array):");
        printf(x);

        System.out.println("Array after in-place reverse:");
        inplace(arr);
    }
}
