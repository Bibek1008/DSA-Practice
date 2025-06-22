package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {

        Stack <Integer>st=new Stack<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to Insert");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" Element");
            st.push(sc.nextInt());
        }
        System.out.println(st);
        Stack <Integer>rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());

        }
        System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);



    }
}
