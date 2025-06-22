package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static void printper(String str,String str2,List<String>l){
        if(str.equals("")){
            l.add(str2);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String rem=left+right;

            printper(rem,str2+ch,l);
        }
    }
    public static void main(String[] args) {



        String str="abc";
        List<String> l=new ArrayList<>();
        printper(str," ",l);
        for(String s:l){
            System.out.println(s);
        }

    }

}
