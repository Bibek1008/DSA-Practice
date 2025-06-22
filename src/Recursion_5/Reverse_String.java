package Recursion_5;

public class Reverse_String {

    static boolean palindrome2(String a,int left,int right){
        //base case
        if(left>=right){
            return true;
        }
        //self work
        //if we use == then it will return true after comparing first letter so we need to check for not equal to
        if(a.charAt(left)!=a.charAt(right)){
            return false;
        }
        //recursive work
        return palindrome2(a,left+1,right-1);

    }

    static boolean palindrome(String a){
        return reverse(a).equals(a);
        //we have to use equals to to check
    }

    static String reverse(String a){
        //small work
        if(a.length()==0){
            return "";
        }
        //recursive work
        String smallans=reverse(a.substring(1));

        //self work
        return smallans+a.charAt(0);

    }


    public static void main(String[] args) {
        System.out.println(reverse("ab  cd"));

        if(palindrome("aba")){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        String s="slevexls";
        int right=s.length()-1;
        if (palindrome2(s,0,right)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }
    }
}
