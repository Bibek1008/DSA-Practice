package Array;

import java.util.Arrays;

public class Sortedornot {
    static void sort(int arr[]){
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static boolean sorted(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={1,4,6,7,8,9,9,9,3,4};
        System.out.println(sorted(arr));
        //placing largest nd smallest element in array
        sort(arr);
        int x[]={arr[0],arr.length-1};
        //shallow pass
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("The largest and smallest are");
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }


    }
}
