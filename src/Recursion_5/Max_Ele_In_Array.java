package Recursion_5;

public class Max_Ele_In_Array {

    static void printArray(int arr[],int index){

        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr,index+1);

    }


    static int max_Array(int arr[],int index){

        if(index==arr.length-1){
            return arr[index];
        }
        int small=max_Array(arr,index+1);
        return Math.max(small,arr[index]);



    }
//time and space complexsity is o(n)


    public static void main(String[]args){


        int arr[]={1,2,4,5,7};
        printArray(arr,0);


        System.out.println("The maximum element from array is"+max_Array(arr,0));


    }




}
