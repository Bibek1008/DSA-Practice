package Recursion_5;

public class Linearsearch {


    static boolean check(int arr[],int target,int index){

        if (index>=arr.length){
            return false;

        }
        if(arr[index]==target){
            return true;
        }
        return check(arr,target,index+1);
    }


    static void checkindex(int arr[],int target,int index){

        if (index>=arr.length){

            return;

        }

        if(arr[index]==target){
            System.out.println(index);;
        }
        checkindex(arr,target,index+1);
    }




    public static void main(String[]args){


        int arr[]={1,2,3,4,5,6};
        int target=3;

        if (check(arr,target,0)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
        checkindex(arr,target,0);


    }






}
