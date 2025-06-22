package Array;

import java.util.Scanner;

public class prifixsum {
    static int[] prifix(int arr[]){

        int n=arr.length;


        for(int i=1;i<n;i++){

            arr[i]+=arr[i-1];
        }
        return arr;
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
        System.out.println("The orginal array is ");
        printf(arr);
        System.out.println("The prifix sum of the given array is ");
        prifix(arr);
        printf(arr);






    }
}
