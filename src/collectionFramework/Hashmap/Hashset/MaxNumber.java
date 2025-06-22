package collectionFramework.Hashmap.Hashset;

import java.util.HashSet;

public class MaxNumber {


    static int maxNumbersOnTable(int arr[]){

        HashSet <Integer> st=new HashSet<>();
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
                max=Math.max(max,st.size());
            }
            else{
                st.remove(arr[i]);
            }
        }

        return max;


    }

    public static void main(String[] args) {


        int [] nums={1,2,3,4,3,2,1,4};
        System.out.println(maxNumbersOnTable(nums));
    }
}
