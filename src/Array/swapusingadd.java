package Array;

public class swapusingadd {



    static void swap(int a,int b){
        System.out.println("The orginal value of a and b is :\n"+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The  value after swap of a and b is :\n"+a+" "+b);
    }

    public static void main(String[] args) {
        int a=3;
        int b=5;
        swap(a,b);
    }
}
