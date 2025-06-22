package recursion_3;

public class Gcd {

    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    static int LCM(int x,int y){

        return (x*y)/gcd(x,y);
    }




    public static void main(String[]args){

        System.out.println(gcd(48,24));
        System.out.println(LCM(48,24));

    }



}
