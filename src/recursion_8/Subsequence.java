package recursion_8;

import java.util.ArrayList;

public class Subsequence {


    static void subsetsum(int[] arr,int index,int currentsum){
        int n=arr.length;
        //base case
        if(index>=n){
            System.out.println(currentsum);
            return;


        }
        //self work


        subsetsum(arr,index+1,currentsum+arr[index]);//to add current element

        subsetsum(arr,index+1,currentsum);//donot add current ele


    }

    static void subSequence2(String s, String currentans){

        //base case
        if(s.length()==0){
            System.out.println(currentans);
            return;
        }
        //self work

        char curr=s.charAt(0);
        String remstring=s.substring(1);
        subSequence2(remstring,currentans+curr);//want to include first char
        subSequence2(remstring,currentans);//exclude first char

    }


    static ArrayList<String>sub_sequence(String s){
        ArrayList<String>ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char currentchar=s.charAt(0);

        ArrayList<String >smallans=sub_sequence(s.substring(1));

        for(String ss:smallans){

            ans.add(ss);
            ans.add(currentchar+ss);
        }

        return  ans;


    }




    public static void main(String[] args) {

        ArrayList<String>ans=sub_sequence("abc");
        for(String s:ans){
            System.out.println(s);
        }

        System.out.println("This is second answer");
        subSequence2("abc","");


        System.out.println("This is answer for array");
        int arr[]={2,4,5};
        subsetsum(arr,0,0);

    }
}
