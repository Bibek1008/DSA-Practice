package _2D_array;

import java.util.Scanner;

public class prifixsum_in_cordinate {
    static int[][] input(int x, int y) {
        int[][] arr = new int[x][y];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Enter element of " + (i + 1) + " row");
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void printf(int arr[][]) {
        int x = arr.length;
        int y = arr[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //approach 1
    static int prifix(int arr[][],int x1,int x2,int y1,int y2){
        int ans=0;
        for(int i=x1;i<=y1;i++){
            for(int j=x2;j<=y2;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
    }

    //third approach for finding
    static void inplace1(int arr[][]){

        int x=arr.length;
        int y=arr[0].length;
        for(int i=0;i<x;i++){
            for(int j=1;j<y;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

        //traverse vertically to calculate column wise sum
        for (int j=0;j<y;j++){
            for(int i=1;i<x;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }

    }

    static  int findsum3(int arr[][],int l1,int r1,int l2,int r2){
        int ans=0;
        int sum=0,up=0,left=0,leftup=0;
        inplace1(arr);

        if (r1>=1) {

            left=arr[l2][r1-1];
        }
        if(l1>=1){
            up=arr[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftup=arr[l1-1][r1-1];
        }
        sum = arr[l2][r2];



        ans=sum-up-left+left;


        return ans;
    }

    //calculating using second approach


    static void inplace(int arr[][]){

        int x=arr.length;
        int y=arr[0].length;
        for(int i=0;i<x;i++){
            for(int j=1;j<y;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    static int sum(int arr[][],int r1,int c1,int r2,int c2){
        int ans=0;
        inplace(arr);
        for (int i=r1;i<=r2;i++){
            if(c1>0) {
                ans += arr[i][c2] - arr[i][c1 - 1];
            }
            else{
                ans+=arr[i][c2];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number & column number of the matrix: ");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();

        int arr[][] = input(row1, column1);
        System.out.println("Enter the starting row and column in i and j ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();

        System.out.println("Enter the ending row and column in i and j ");
        int y1=sc.nextInt();
        int y2=sc.nextInt();


        //printing ans by method 1 which is called taking extra array
        System.out.println("The matrix given is:");
        printf(arr);
        System.out.println("The ans is "+" "+prifix(arr,x1,x2,y1,y2));

        //printing ans by method 2 which is called inplace but complexity is high array
        System.out.println("The answer using optimization is"+sum(arr,x1,x2,y1,y2));

        //printing by approach 3

        System.out.println("The ans is ");
        System.out.println(findsum3(arr,x1,x2,y1,y2));



        sc.close();
    }
}
