package Sorting_Algo;

public class Bubble_sort {

    static void bubblesort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            //for optimized bubble sort if some element are already sorted then
            boolean flag=false;

            for(int j=0;j< arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                break;
            }

        }

    }

//Time complexsity is o(n^2)
    //best case by doing this we can make it in o(n)
//maximum number of swap in worse case is n(n-1)/2
//bubble sort is stable sort that is equality element cames in same order after sorting
    //unstable sort means their position can change eg 1,3,4,2,3*
                                //stable sort 1 2 3 3* 4
                                //unstable sort 1 2 3* 3 4
    public static void main(String[] args) {

        int arr[]={2,1,3,4,5,6};


        bubblesort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
