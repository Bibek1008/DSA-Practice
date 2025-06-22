package recursion2_last;

public class numberof_digit {

    static int number(int n){
        if(n<0){
            n=-n;
        }
        //base case
        if(n>=0 && n<=9){
            return 1;
        }
        else{
            return 1+ number(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(number(0));
    }
}
