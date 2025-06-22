package _2D_array;

import java.util.Scanner;

public class Transpose_of_matrix {
    //method to take input of 2D array
    static int[][] input(int x,int y){
        int [][]arr=new int[x][y];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x;i++){
            System.out.println("Enter element of "+(i+1)+" row");
            for(int j=0;j<y;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    //method to print element of 2D array
    static void printf(int arr[][]){
        int x=arr.length;
        int y=arr[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //method to swap element of column in array
    static void swap(int arr[][],int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;

    }

    static  void transposeinplace(int arr[][]){

        for(int i=0;i<arr[0].length;i++){
            for(int j=i;j<arr.length;j++){
                swap(arr,i,j);
            }
        }
        printf(arr);
    }

    static int[][] transpose(int arr[][]){
        int ans[][]=new int[arr[0].length][arr.length];

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number & column number matrix ");
        int row1=sc.nextInt();
        int column1=sc.nextInt();

        System.out.println("Enter element of  matrix");
        int arr1[][]=input(row1,column1);
        System.out.println("The given matrix is");
        printf(arr1);

//        int ans[][]=transpose(arr1);
//        System.out.println("The matrix after transpose is");
//        printf(ans);

        System.out.println("The transpose of matrix in place ");
        transposeinplace(arr1);

        sc.close();


    }
}
