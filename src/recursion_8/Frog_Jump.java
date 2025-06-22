package recursion_8;

public class Frog_Jump {

    //time complexsity is 2^n

    static  int best(int h[],int index,int n){
        //base case
        if (index==n-1){
            return 0;
        }
        int op1=best(h,index+1,n)+Math.abs(h[index]-h[index+1]);
        if (index==n-2){
            return op1;
        }

        int op2=best(h,index+2,n)+Math.abs(h[index]-h[index+2]);

        return Math.min(op1,op2);

    }




    public static void main(String[] args) {

        int arr[]={10,30,40,20};
        System.out.println("the minimum cost for doing this is "+best(arr,0,arr.length));

    }
}
