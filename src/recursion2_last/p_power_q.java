package recursion2_last;

public class p_power_q {

    static int power(int p, int q){
        if(q==0){
            return 1;
        }
        else{
            return p*power(p,q-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
}
