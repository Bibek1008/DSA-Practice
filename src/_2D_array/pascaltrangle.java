package _2D_array;

import java.util.Scanner;

public class pascaltrangle {

    static void pascal(int n){
        int arr[][]=new int [n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;


            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }


        printf(arr,n);
    }


    //method to print element of 2D array
    static void printf(int arr[][],int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int row1 = sc.nextInt();
        System.out.println("The ans of pascal trangle is");
        pascal(row1);



        sc.close();
    }
}
