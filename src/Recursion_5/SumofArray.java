package Recursion_5;

public class SumofArray {





        static int printArray(int arr[],int index){

            if(index==arr.length){
                return 0;
            }

            return printArray(arr,index+1)+arr[index];

        }
        public static void main(String[]args){


            int arr[]={1,2,4,5,7};
            System.out.println(printArray(arr,2));
        }






}
