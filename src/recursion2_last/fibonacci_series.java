package recursion2_last;

import java.util.Scanner;

public class fibonacci_series {
    static int fact(int n){
        if(n==0){
            return 0;
        }
        else
            return n* fact(n-1);
    }

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }


        else{
            return fibo(n-2)+fibo(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number which you want to find out fibo");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(fibo(x));

        System.out.println("The first 10 fibonacci number are");
        for(int i=0;i<10;i++){
            System.out.println(fibo(i));
        }
    }
}
