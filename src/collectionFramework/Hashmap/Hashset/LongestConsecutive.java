package collectionFramework.Hashmap.Hashset;

import java.util.HashSet;

public class LongestConsecutive {

    public int longest(int []arr){
        HashSet<Integer> st=new HashSet<>();
        for(int i:arr){
            st.add(i);
        }
        int maxStreak=0;
        for(int num:st){

            if(!st.contains(num-1)){//num is starting point of a sequence
                int currNum=num;
                int currStreak=1;//length of current consecutive num
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;


    }


    public static void main(String[] args) {







    }
}
