package DP;

import java.util.List;

public class Knapsack {

    private static int helper(int idx,int w,List<Integer> profit, List<Integer> weight,int [][]dp){

        if(idx==0){
            if(weight.get(0)<=w){
                return profit.get(0);
            }
            else{
                return 0;
            }
        }

        if(dp[idx][w]!=-1){
            return dp[idx][w];
        }
        int pick=0;

        if(w>=weight.get(idx)){
            pick=profit.get(idx)+helper(idx-1,w-weight.get(idx),profit,weight,dp);
        }
        int not_pick=helper(idx-1,w,profit,weight,dp);


        return dp[idx][w]=Math.max(pick,not_pick);
    }



    public static void main(String[] args) {



        List<Integer> profit=List.of(1,2,3);
        List<Integer> weight=List.of(4,5,1);




        int w=4;
        int n=profit.size();


        int [][]dp=new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                dp[i][j]=-1;
            }
        }


        System.out.println(helper(n-1,w,profit,weight,dp));



    }
}
