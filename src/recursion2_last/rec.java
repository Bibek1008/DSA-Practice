package recursion2_last;

public class rec {

    static int fact(int n){
        if (n<0){

            return -1;
        } else if (n==0) {
            return 1;

        }
        else
                return n* fact(n-1);
    }


    public static void main(String[] args) {
        int n=-9;
        if(fact(n)==-1){
            System.out.println("The factorial of negative number is not possible");
        }
        else{
            System.out.println(fact(n));
        }


    }
}
