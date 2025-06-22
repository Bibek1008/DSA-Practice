package BinarySearch;

public class DistributeChocolate {

    static  boolean isDivisible(int a[],int m,int mxChocolate){
        int numberOfStudent=1;
        int cho=0;
        for(int i=0;i<a.length;i++){

            if(a[i]>mxChocolate) return false;
            if(cho+a[i]<=mxChocolate){
                cho+=a[i];
            }
            else{
                numberOfStudent++;
                cho=a[i];
            }
        }
        if(numberOfStudent>m) return false;
        return true;


    }
    static  int Distribute(int arr[],int m){
        if(arr.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }




    public static void main(String[] args) {

        int arr[]={12,34,67,90};
        int m=2;
        System.out.println(Distribute(arr,m));
    }
}
