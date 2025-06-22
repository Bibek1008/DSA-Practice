package BinarySearch;

public class FirstOccurance {
    static int binarysearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        int fo=-1;
        int index=0;
        while (start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                fo=arr[mid];
                end=mid-1;
                index=mid;
            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        System.out.println("The index is "+ index);



        return fo;
    }

    public static void main(String[] args) {

        int arr[]={4,4,4,5,7,8,9,10};
        int target=4;
        System.out.println(binarysearch(arr,target));
    }
}
