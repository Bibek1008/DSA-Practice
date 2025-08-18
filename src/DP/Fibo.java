package DP;

public class Fibo {



    private static  int fibonacci(int x,int []arr){

        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        if(arr[x]!=-1){
            return arr[x];
        }
        arr[x]=fibonacci(x-1,arr)+fibonacci(x-2,arr);
        return arr[x];
    }
    public static void main(String[] args) {

        int n=10;

        int []arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=-1;
        }
        System.out.println(fibonacci(n,arr));


    }

}
