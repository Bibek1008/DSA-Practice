package Sorting_Algo2;

public class CountSort {

    static int findMax(int arr[]){
       int x=Integer.MIN_VALUE;
       for(int i=0;i< arr.length;i++){
           if (arr[i]>x){
               x=arr[i];
           }
       }
       return x;

    }

    static void print(int arr[]){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static  void basicCountSort(int arr[]){
        // finding largest element in array
        int max=findMax(arr);
        int count[]=new int[max+1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;

        for (int i=0;i< count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }




    }
    public static void main(String[] args) {

        int arr[]={1,4,3,3,2,1,1,2};
        System.out.println("The orginal array is ");
        print(arr);

        System.out.println("The array after sort is ");
        basicCountSort(arr);
        print(arr);

    }
}
