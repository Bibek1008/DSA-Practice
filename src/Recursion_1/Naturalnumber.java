package Recursion_1;

import java.util.Scanner;

public class Naturalnumber {
    static void printn(int n){
        System.out.print(n+" ");
        if(n==1){

            return;
        }
        printn(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        printn(n);
    }
}
