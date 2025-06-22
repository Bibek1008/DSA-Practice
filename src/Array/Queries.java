package Array;

import java.util.Scanner;

public class Queries {
    static int[] makefrequency(int arr[]){
        int [] fre=new int[100005];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        return fre;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int fre[]=makefrequency(arr);
        System.out.println("Enter the queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter element");
            int x=sc.nextInt();
            if(fre[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
