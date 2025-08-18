package DP;

public class House_rubber {


    static int rob(int[]houses,int idx,int []dp){


        if(idx>=houses.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int pick=houses[idx]+rob(houses,idx+2,dp);
        int notpick=rob(houses,idx+1,dp);

        return dp[idx]=Math.max(pick,notpick);
    }

    public static void main(String[] args) {

        int n=4;
        int[]houses=new int[n];
        houses[0]=1;
        houses[1]=2;
        houses[2]=3;
        houses[3]=1;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(rob(houses,0,dp));



    }
}
