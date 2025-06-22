package BinarySearch;

public class RotedsortedArray {

    //duplicate element also
    static int search_1(int arr[],int target){
        int n=arr.length;
        int start=0;int end= n-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){

                return mid;
            } else if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
                start++;end--;


            } else if(arr[mid]<=arr[end]){//mid to end sorted

                if(target>arr[mid]&& target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{//start to mid sorted
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }


        return -1;
    }

    static int search(int arr[],int target){
        int n=arr.length;
        int start=0;int end= n-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){

                return mid;
            }
            else if(arr[mid]<arr[end]){//mid to end sorted

                if(target>arr[mid]&& target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{//start to mid sorted
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }


        return -1;
    }




    public static void main(String[] args) {

        int arr[]={
                3,4,5,1,2
        };
        int brr[]={1,1,1,1,2,2,3,3,1};
//        System.out.println(search(arr,4));

        System.out.println(search_1(brr,4));

    }
}
