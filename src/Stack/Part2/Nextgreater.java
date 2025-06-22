package Stack.Part2;

import java.util.Stack;

public class Nextgreater {




    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int res[]=new int[arr.length];
        Stack <Integer>st=new Stack<>();
        res[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for (int i = arr.length - 2; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }


            res[i] = st.isEmpty() ? -1 : st.peek();


            st.push(arr[i]);
        }


        for(int i:res){
            System.out.print(i+" ");
        }
    }

}


