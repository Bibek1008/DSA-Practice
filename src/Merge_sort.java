public class Merge_sort {

    static void displayArray(int arr[]){

        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /* the absence of doing good id the presence of intelligence */

//it is divide and conquire algorithms

    //time complexsity is nlog(n) and space complexsity is o(n)
    //it is stable algorithms

    static  void  merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];

        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for (j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        i=0;j=0;k=l;

        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];

            }
            else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }







    }
    static  void merge_sort(int arr[],int l,int r){

        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        merge(arr,l,mid,r);




    }


    public static void main(String[] args) {

    int arr[]={1,4,2,56,24,23,56,1};

        System.out.println("The orginal array is "); displayArray(arr);
    merge_sort(arr,0,arr.length-1);

        System.out.println("The sorted Array is ");
        displayArray(arr);




    }
}
