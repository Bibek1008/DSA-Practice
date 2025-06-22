package _2D_array;

import java.util.Scanner;

public class Reverseof_Eachrow {

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
        static void swap(int arr[][],int i,int x,int j){
            int temp=arr[i][x];
            arr[i][x]=arr[i][j];
            arr[i][j]=temp;
        }

        //reverse method to reverse element in columnwise
       static int[][] reverse(int arr[][]){

            for(int i=0;i< arr.length;i++){
                int x=0;int j=arr[0].length-1;
                while (x<j){
                    swap(arr,i,x,j);
                    j--;x++;
                }
            }
            return arr;

       }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter row number & column number matrix ");
            int row1=sc.nextInt();
            int column1=sc.nextInt();

            System.out.println("Enter element of  matrix");
            int arr1[][]=input(row1,column1);



            System.out.println("The Matrix is ");
            printf(reverse(arr1));

            sc.close();


        }


}
