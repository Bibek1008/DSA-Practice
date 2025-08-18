package Greedy;

import java.util.ArrayList;
import java.util.List;

public class SmallestNum {





    public static void main(String[] args) {

        int s=19;
        int d=4;

        if(s==0 || s>d*9){
            System.out.println("not possible");
            return;
        }

        List<Integer> number=new ArrayList<>();
        for(int i=0;i<d;i++){
            number.add(0);
        }
        s-=1;
//        number.set(0,1);
        for(int i=d-1;i>=0;i--){

            if(s>=9){
                number.set(i,9);
                s-=9;
            }
            else {
                number.set(i,s);
                break;
            }
        }
        number.set(0,number.get(0)+1);
        for (int digit : number) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
