package Greedy;

import java.util.*;

public class Palindrome {

    static boolean validate(List<Integer> frequency){
        boolean isodd=false;
        for(int i=0;i<frequency.size();i++){
            if(frequency.get(i)%2!=0){
                if(isodd){
                    return false;
                }
                isodd=true;
            }
        }
        return true;

    }

    public static void main(String[] args) {



        String number="00000";

        List<Integer> frequency= new ArrayList<>();

        for (int i=0;i<10;i++){
            frequency.add(0);
        }

        int n=number.length();

        for (int i=0;i<n;i++){

            int digit=number.charAt(i)-'0';


            frequency.set(digit,frequency.get(digit)+1);
        }

        if(!validate(frequency)){
            System.out.println("Not palindrome");
            return;
        }

        StringBuilder firsthalf=new StringBuilder();

        for(int i=9;i>=0;i--){
            while (frequency.get(i)>1){
                firsthalf.append(i);
                frequency.set(i,frequency.get(i)-2);
            }
        }

        StringBuilder sb=new StringBuilder(firsthalf);
        sb.reverse();
        String secondhalf=sb.toString();
        String middle="";


        for(int i=9;i>=0;i--){
            if (frequency.get(i)==1){
                middle = String.valueOf(i);
                break;

            }
        }

        String result=firsthalf.toString()+middle+secondhalf;
        result = result.replaceFirst("^0+(?!$)", "");
        System.out.println(result);

    }
}
