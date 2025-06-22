package Stack;

import java.util.Stack;

public class InsertionInStack {

    static void printusingrec(Stack<Integer>st){
        if (st.size()<1){
            st.push(45);
            return;
        }
       int x=st.pop();

        printusingrec(st);
//       System.out.print(x+" ");
//        st.push(54);
        st.push(x);
    }
    static void display(Stack<Integer> s){
        Stack<Integer>temp=new Stack<>();

        while(s.size()>0){

            temp.push(s.pop());
        }
        while(temp.size()>0){
            int x=temp.pop();
            System.out.print(x+" ");
            s.push(x);
        }

        System.out.println();

    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(6);
        st.push(65);
        st.push(90);
        st.push(43);
        System.out.println(st);
        int idx=2;
        int x=7;
        Stack<Integer>temp=new Stack<>();
        while(st.size()>2){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
        display(st);
        printusingrec(st);
        display(st);




    }





}
