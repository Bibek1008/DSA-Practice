package String;

import java.util.Scanner;

public class Palindrome {

    static  boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
//        String s="abcdcbaa";
//        StringBuilder s1=new StringBuilder(s);
//
//        s1.reverse();
//        if(s.equals(s1.toString())){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//
//        int i=0;
//        int j=s.length()-1;
//        boolean flag=true;
//        while (i<j){
//            if (s.charAt(i)!=s.charAt(j)){
//                flag=false;
//            }
//            i++;j--;
//        }
//        if(flag){
//            System.out.println("Palindrome ho");
//        }
//        else{
//            System.out.println("Not palindrome ho");
//        }
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\n"+count);


        //substring
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                System.out.print(s.substring(i,j)+" ");

            }
        }




    }
}
