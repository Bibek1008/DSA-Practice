package collectionFramework.Hashmap;

import java.util.HashMap;

public class LargestSubarray {


    public static int zeroSubarray(int[]arr,int n){
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        int maxlength=0;
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(!mp.containsKey(prefix)){
                mp.put(prefix,i);
            }
            else{
                maxlength=Math.max(maxlength,i-mp.get(prefix));
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {

    }
}
