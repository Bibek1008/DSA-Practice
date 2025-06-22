package placement;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Palindrome {
    static boolean check(String st){

        int x=st.length()-1;
        int i=0;
        int j=x;
        boolean flag=true;
        while(i<j){
            if(st.charAt(i)==st.charAt(j)){
                i++;j--;
            }
            if(st.charAt(i)!=st.charAt(j)){
                return false;

            }

        }


        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println(st);


        if(check(st)){
            System.out.println("The string is palindrome ");
        }else{
            System.out.println("The string is not palindrome");
        }


    }






}
