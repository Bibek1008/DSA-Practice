package Array;

public class Numberofoccurances_of_element {

    static int count=0;
    int lastindex=-1;
    static int counting(int[]arr,int x){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,3,8,2,4};
        int y=4;
        int x=counting(arr,y);
        if(x==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The number of occurance of "+y+" is "+x);
        }


    }
}
