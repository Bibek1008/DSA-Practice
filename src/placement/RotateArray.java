package placement;

import java.util.Scanner;

public class RotateArray {

    static void swap(int arr[][],int i1,int j1,int i2,int j2){
        int temp=arr[i1][j1];
        arr[i1][j1]=arr[i2][j2];
        arr[i2][j2]=temp;

    }
    static void transpose(int arr[][]){
        int x=arr[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<i;j++){
                swap(arr,i,j,j,i);

            }
        }
        int i=0;
        int j=x-1;
        while(i<j){
            swap(arr,i,x-j-1,i,j);
            i++;j--;


        }

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter square matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        System.out.println("Enter data in matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        transpose(arr);
        System.out.println("The transpose matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }



    }
}
