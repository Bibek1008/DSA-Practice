package collectionFramework.Hashmap;

import java.util.*;

public class FrequencyMap {


    public static void main(String[] args) {


        int arr[]={1,3,2,1,4,1,4,4,4,1};

        Map<Integer,Integer> mp=new HashMap<>();

        for(var i:arr){

            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                mp.put(i,mp.get(i)+1);
            }
        }


        System.out.println(mp.entrySet());


        int maxval=0;
        int anskey=-1;

        for(var e:mp.entrySet()){

            if(e.getValue()>maxval){
                maxval=e.getValue();
                anskey=e.getKey();
            }
        }

        System.out.println("The maximum freq is "+maxval+" of the key is "+anskey);

    }
}
