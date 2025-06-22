package Array;

import java.util.Scanner;

public class sortarraywithsquire {
    static int[] reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        int k= arr.length-1;
        int ans[]=new int[arr.length];
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k--]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }
        //inplace(ans);

        return ans;

    }
    static void pointermethod(int arr[]){
        int j= arr.length-1;
        int i=0;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;j--;
            }
            if (arr[i]==0){
                i++;
            }
            if (arr[j]==1){
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
        int ans[]=reverse(arr);
        System.out.println("The ans of the given array is ");
        printf(ans);




    }
}
