package recursion_3;

public class sumofalternative {

    static int sum(int n){

        if(n==0){
            return 0;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }
        return sum(n-1)+n;
    }



    public static void main(String[]args){
        System.out.println(sum(10));



    }
}
