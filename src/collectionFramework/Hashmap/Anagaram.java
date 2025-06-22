package collectionFramework.Hashmap;
import java.util.*;
public class Anagaram {

    static HashMap<Character, Integer> makefrequency(String str){

        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){

            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currefre=mp.get(ch);

                mp.put(ch,currefre+1);
            }
        }


        return mp;
    }

    public boolean is_Anagaram(String s1, String s2){

        if(s1.length()!=s2.length()){

            return false;
        }
        HashMap<Character,Integer>  mp1=makefrequency(s1);
        HashMap<Character,Integer> mp2=makefrequency(s2);


        return mp1.equals(mp2);
    }
    public boolean is_Anagaram2(String s1, String s2){

        if(s1.length()!=s2.length()){

            return false;
        }
        HashMap<Character,Integer>  mp1=makefrequency(s1);
       for(int i=0;i<s2.length();i++){

           char ch=s2.charAt(i);
           if(!mp1.containsKey(ch)){
               return false;
           }
           int currentFreq=mp1.get(ch);
           mp1.put(ch,currentFreq-1);

       }
       //all value of map should be zero

        for(int i:mp1.values()){

            if(i!=0){
                return false;
            }

        }


        return true;
    }

    public static void main(String[] args) {

    }


}
