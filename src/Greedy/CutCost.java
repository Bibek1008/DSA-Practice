package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CutCost {


    public static void main(String[] args) {

        int M=6;
        int N=4;
        List<Integer> x=new ArrayList<>();
        List<Integer> y=new ArrayList<>();

        x.add(2);x.add(1);x.add(3);x.add(1);x.add(4);
        y.add(4);y.add(1);y.add(2);

        x.sort(Comparator.reverseOrder());
        y.sort(Comparator.reverseOrder());

        int no_of_vertical_piece=1;
        int no_of_horizontal_piece=1;
        int totalcost=0;

        int i=0,j=0;

        while (i<M-1 && j<N-1){

            if(x.get(i)>y.get(j)){
                totalcost+=x.get(i)*no_of_horizontal_piece;
                no_of_vertical_piece++;
                i++;
            }
            else{

                totalcost+=y.get(j)*no_of_vertical_piece;
                no_of_horizontal_piece++;
                j++;
            }

        }
        while (i<M-1){
            totalcost+=x.get(i)*no_of_horizontal_piece;

            i++;
        }
        while (j<N-1){
            totalcost+=y.get(i)*no_of_vertical_piece;

            j++;
        }

        System.out.println(totalcost);


    }
}
