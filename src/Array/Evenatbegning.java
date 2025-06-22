package Array;

import java.util.Scanner;

public class Evenatbegning {
    static void pointermethod(int arr[]){
        int j= arr.length-1;
        int i=0;
        while(i<j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap(arr,i,j);
                i++;j--;
            }
            if (arr[i]%2==0){
                i++;
            }
            if (arr[j]%2==1){
                j--;
            }
        }
        printf(arr);
    }



    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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


        System.out.println("printing array after using while loop");
        pointermethod(arr);



    }
}
