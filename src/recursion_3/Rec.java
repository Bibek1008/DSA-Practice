package recursion_3;

public class Rec {

    static  void multiple(int x, int k){
        if(k==1){
            System.out.println(x);
            return;
        }
        multiple(x,k-1);

        System.out.println(x*k);



    }


    public static void main(String[]args){

        multiple(2,3);


    }


}
