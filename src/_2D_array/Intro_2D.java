package _2D_array;


import java.util.Scanner;

public class Intro_2D {

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


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number & column number ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=input(row,column);
        System.out.println("The 2D array entered is ");
        printf(arr);

    }
}
