package Array;

import java.util.Scanner;

public class Lastvaluereptinginarry {


    static int last(int arr[]){
        int x=-1;
        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    x=arr[i];
                }
            }
        }

        return x;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        int []arr=new int[num];

        for (int i=0;i< arr.length;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("The last occurance is "+last(arr));

    }
}
