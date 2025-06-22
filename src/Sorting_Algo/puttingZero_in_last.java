package Sorting_Algo;

public class puttingZero_in_last {


    static void moves(int arr[]){


        for (int i=0;i< arr.length-1;i++){
           boolean flag=false;

           for (int j=0;j< arr.length-1-i;j++){

               if(arr[j]==0 && arr[j+1]!=0){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   flag =true;
               }
           }
           if(flag==false){
               break;
           }
        }


    }

    public static void main(String[] args) {


        int arr[]={0,0,5,0,0};

        moves(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
