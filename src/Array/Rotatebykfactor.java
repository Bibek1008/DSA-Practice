package Array;

import java.util.Scanner;

public class Rotatebykfactor {

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
        System.out.println("Enter the value of factor k");
        int k=sc.nextInt();
        k=k%num;
        int x[]=new int[num];
        int p=0;
        for (int i=num-k;i<num;i++){
            x[p++]=arr[i];
        }
        for (int i=0;i<=num-k-1;i++){
            x[p++]=arr[i];
        }

        System.out.println("The orginal array is ");
        printf(arr);
        System.out.println("The array after rotation is ");
        printf(x);
    }




}
