package Sorting_Algo;

public class Insertion_Sort {

    //principle Take one element iterate through the sorted and find the correct position of that ele
    static void insertion_sort(int arr[]){
        int n= arr.length;

        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        //time complexsity is o(n^2) and it is stable algorithms

    }



    public static void main(String[] args) {

        int arr[]={8,3,6,5,4,2};

        insertion_sort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
