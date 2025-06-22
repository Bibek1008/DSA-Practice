package placement;

import java.util.Scanner;

public class Even_odd {






    static boolean check(int num){
        if(num%2!=0){
            return false;
        }
        return true;

    }
    static int reverse(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }

    static int sum(int num){
        int x=num;
        int ans=0;
        while(x>0){
            int rem=x%10;

            ans+=rem;
            x=x/10;

        }
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(check(n)){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        System.out.println(sum(n));
        System.out.println("The reverse of this number is");
        System.out.println(reverse(n));

//        System.out.println("The alternative number is"+alternative(n));
    }
}
