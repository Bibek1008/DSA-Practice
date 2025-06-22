package _2D_array;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

public class Reversing_Element_in_Arraylist {

    static void reverse(ArrayList<Integer>list){
        int n=list.size();
        int i=0;
        int j=n-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> x=new ArrayList<>();
        x.add(0);
        x.add(10);
        x.add(3);
        x.add(5);
        x.add(22);
        x.add(10);
        System.out.print("The orginal list is "+x);
        reverse(x);
        System.out.println();
        System.out.print("The reverse arraylist is "+x+"\n");

        Collections.reverse(x);
        System.out.println(x);

        Collections.sort(x);
        System.out.println("sort in accending order"+x);
        Collections.sort(x,Collections.reverseOrder());
        System.out.println("In decending order"+x);

        ArrayList<String> s=new ArrayList<>();
        s.add("Bibek");
        s.add("Bhandari");
        s.add("James");
        Collections.sort(s);
        System.out.println(s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);
    }
}
