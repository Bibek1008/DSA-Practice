package DP;

public class Fibo_tabulation {

    public static void main(String[] args) {
        int n = 20;

        int pre1=1;
        int pre2=1;
        int curr=0;
        for (int i = 3; i <= n; i++) {

            curr=pre1+pre2;
            pre2=pre1;
            pre1=curr;
        }

        System.out.println("using tabulation");
        System.out.println(curr);
    }
}
