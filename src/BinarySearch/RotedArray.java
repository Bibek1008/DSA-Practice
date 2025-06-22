package BinarySearch;

public class RotedArray {

    static int findMinIndex(int arr[]){
        int n= arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }



    public static void main(String[] args) {


        int arr[]={3,4,5,6,1,2};
        System.out.println(findMinIndex(arr));
    }
}
