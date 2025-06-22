package _2D_array;

import java.util.Scanner;

public class Matrix_mul {
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
    static int[][] multiplication(int arr1[][],int arr2[][]){

        int c[][]=new int[arr1.length][arr2[0].length];
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr2.length;k++){
                    c[i][j]+=(arr1[i][k]*arr2[k][j]);

                }
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number & column number of first matrix ");
        int row1=sc.nextInt();
        int column1=sc.nextInt();
        System.out.println("Enter row number & column number of second matrix ");
        int row2 =sc.nextInt();
        int column2 =sc.nextInt();
        if(column1!=row2){
            System.out.println("Multiplication not possible");
            return;
        }
        System.out.println("Enter element of first matrix");
        int arr1[][]=input(row1,column1);

        System.out.println("Enter the element of second matrix");
        int arr2[][]=input(row2, column2);

        System.out.println("The array first is ");
        printf(arr1);

        System.out.println("The array second is ");
        printf(arr2);
//



        System.out.println("The resultant array is ");
        int c[][]=multiplication(arr1,arr2);
        printf(c);

        sc.close();


    }
}
