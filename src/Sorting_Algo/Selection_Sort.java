package Sorting_Algo;
//select an element and put at another array
public class Selection_Sort {



    //The space complexsity is o(1) and time complexsity is o(n^2)
    // it is unstable algorithms but it is inplace algorithm




    static void selection(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int min_index=i;
            for(int j=min_index+1;j< arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            //swaping current ele and element at min index
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }




    public static void main(String[] args) {
        int arr[]={1,4,6,2,3,9};
        selection(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
