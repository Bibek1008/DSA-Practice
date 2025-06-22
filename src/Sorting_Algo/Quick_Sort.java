package Sorting_Algo;
//it is not stable algorithms
//its time complexsity is avg and best case is nlog(n) but in worse iso(n^2)
//space complexsity is log(n)


public class Quick_Sort {
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int arr[],int st,int end){
        int pivot=arr[st];
        int count=0;
        for (int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivot_index=st+count;
        swap(arr,st,pivot_index);
        int i=st;
        int j=end;
        while (i<pivot_index && j>pivot_index){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }

            if (i<pivot_index && j>pivot_index){
                swap(arr,i,j);
                i++;
                j--;
            }



        }


        return pivot_index;
    }

    static void quicksort(int arr[],int st,int end){

        //base case
        if(st>=end){
            return;
        }
        int pt=partition(arr,st,end);
        quicksort(arr,st,pt-1);
        quicksort(arr,pt+1,end);
    }

    static void print(int arr[]){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={1,4,2,5,3,6,4};
        System.out.println("Array before sorting");
        print(arr);
        quicksort(arr,0, arr.length-1);
        System.out.println("Array After sorting");
        print(arr);


    }

}
