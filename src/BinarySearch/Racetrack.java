package BinarySearch;

public class Racetrack {
    static boolean ispossible(int arr[],int k,int dist){
        int kidPlace=1;
        int lastKid=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]-lastKid>=dist){
                kidPlace++;
                lastKid=arr[i];
            }

        }
        return kidPlace>=k;
    }

    static int optimal(int arr[],int k){

        if(k>arr.length){
            return -1;
        }
        int st=0,end=(int)1e9;
        int ans=1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(ispossible(arr,k,mid)){//
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        int k=2;
        System.out.println(optimal(arr,k));


    }
}
