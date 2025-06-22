package Array;

import java.util.Scanner;

public class Equalpartition_of_array {
    static int sum(int arr[]){

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }


    static boolean equalsumpartition(int arr[]){

        int totalsum=sum(arr);
        int prifixsum=0;
        for (int i=0;i<arr.length;i++){
            prifixsum+=arr[i];
            int suffic=totalsum-prifixsum;
            if(prifixsum==suffic){
                return true;
            }
        }
        return false;
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
        for (int i = 0; i <num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The orginal array is ");
        printf(arr);
        System.out.println("The equal partition "+ equalsumpartition(arr));

    }
}
