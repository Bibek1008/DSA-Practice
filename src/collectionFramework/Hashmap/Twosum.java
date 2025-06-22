package collectionFramework.Hashmap;
import java.util.*;
public class Twosum {



    public int[] twoSum(int []nums, int target){



        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(find==nums[j]){
                    return new int[]{i,j};

                }

            }
        }
        return new int[]{-1,-1};
    }
    public int[] twoSum2(int []nums, int target){


        HashMap<Integer,Integer>mp=new HashMap<>();


        for(int i=0;i<nums.length;i++){
            int part=target-nums[i];
            if(mp.containsKey(part)){
                return new int[]{i,mp.get(part)};
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }


}
