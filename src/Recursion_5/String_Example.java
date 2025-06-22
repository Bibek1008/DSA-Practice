package Recursion_5;

public class String_Example {

    static  String removechar2(String a){
        //base case
        //time complexsity o(n2)
        if(a.length()==0){
            return "";
        }
        String smallans=removechar2(a.substring(1));

        if (a.charAt(0)!='a'){
            return  a.charAt(0)+smallans;
        }
        return smallans;
    }
    static  String removechar(String a,int index){

        //time complexsity is o(n2)

        //base case

        if(index==a.length()){
            return " ";
        }
        //recursive work
        String smallans=removechar(a,index+1);
        //self work

        if(a.charAt(index)!='a'){
            return a.charAt(index)+smallans;
        }
        return smallans;
    }

    public static void main(String[] args) {

        System.out.println(removechar("abcabs",0));
        System.out.println(removechar2("abcabs"));

    }
}
