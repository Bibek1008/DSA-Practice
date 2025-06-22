package Array;

import java.util.Scanner;

public class Secondmaximum {



    static int max(int arr[]){
        int n=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return  n;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        int []arr=new int[num];

        for (int i=0;i< arr.length;i++){

            arr[i]=sc.nextInt();
        }
        int x=max(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        System.out.println("The second max is "+max(arr));

    }
}
