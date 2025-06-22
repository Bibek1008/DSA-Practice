package recursion2_last;

public class sumof_digit {

    static int digit(int n){
        if (n>=0 && n<=9){
            return n;
        }
        int small_ans=digit(n/10);
        return small_ans+n%10;
    }



    public static void main(String[] args) {
        System.out.println(digit(123456));
    }
}
