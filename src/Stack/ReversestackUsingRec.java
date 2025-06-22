package Stack;

import java.util.Stack;

public class ReversestackUsingRec {
    static void PushAtbottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        PushAtbottom(st,x);
        st.push(top);


    }
    static void printusingrec(Stack<Integer> st){
        if (st.size()==1){

            return;
        }
        int x=st.pop();

        printusingrec(st);
//       System.out.print(x+" ");
//        st.push(54);
        PushAtbottom(st,x);
    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(65);
        st.push(90);
        st.push(43);
        System.out.println(st);

        printusingrec(st);
        System.out.println(st);
    }
}
