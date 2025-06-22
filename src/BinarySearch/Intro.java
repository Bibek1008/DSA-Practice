package BinarySearch;

public class Intro {


    static boolean binarysearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }




        return false;
    }

    public static void main(String[] args) {

        int arr[]={1,4,5,7,8,9,10};
        int target=4;
        System.out.println(binarysearch(arr,target));
    }

}
