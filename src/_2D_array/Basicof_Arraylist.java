package _2D_array;
import java.util.ArrayList;

public class Basicof_Arraylist {




    public static void main(String[] args) {


        Integer x=Integer.valueOf(4);
        Float y=Float.valueOf(5.6F);
        ArrayList <Integer> a=new ArrayList<>();
        //adding element in array list

        for (int i=0;i<10;i++){
            a.add(i+1);
        }
        //accessing arraylist element
        for (int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        System.out.println(a);

        //adding element in between
        a.add(3,100);
        System.out.println(a);

        a.set(3,300);
        System.out.println(a);

        a.remove(10);
        System.out.println(a);

        a.remove(Integer.valueOf(8));
        System.out.println(a);
        a.remove(0);
        ArrayList b=new ArrayList();
        b.add("True");
        b.add(2);
        b.add(7.8);
        System.out.println(b);


    }
}
