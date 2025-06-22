package placement;


import java.util.Scanner;

public class BellTrangle {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int arr[][]=new int[10][10];
        arr[0][0]=1;
        for (int i=1;i<n;i++){
            arr[i][0]=arr[i-1][i-1];

            for(int j=1;j<=i;j++){
                arr[i][j]=arr[i][j-1]+arr[i-1][j-1];
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
