package Array;

public class Lastoccurances {




        static int lastindex=-1;
        static int last(int[]arr,int x){
            for (int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    lastindex=i;
                }
            }
            return lastindex;
        }
        public static void main(String[] args) {
            int arr[]={1,4,7,3,8,2,4};
            int y=4;
            int x=last(arr,y);
            if(x==-1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("The element "+y+" is occured lastly in  "+x+" index");
            }


        }


}
