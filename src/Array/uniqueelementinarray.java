package Array;

import java.util.Scanner;

public class uniqueelementinarray {
    static void unique(int arr[]){

        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                System.out.println("The ans is "+ arr[i]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        int []arr=new int[num];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter element "+i+1+" in array");
            arr[i]=sc.nextInt();
        }
        unique(arr);

    }
}
