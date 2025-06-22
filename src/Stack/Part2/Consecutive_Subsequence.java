package Stack.Part2;

import java.util.ArrayList;
import java.util.Stack;

public class Consecutive_Subsequence {

    static ArrayList<Integer>remove(int arr[]){
        Stack<Integer>st=new Stack<>();


        for(int i=0;i<arr.length;i++){

            if(st.size()!=0 && arr[i]==st.peek()){
                if(i==arr.length-1||arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
            else {
                st.push(arr[i]);
            }

        }


        return new ArrayList<>(st);
    }


    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        ArrayList<Integer>res=remove(arr);
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}
