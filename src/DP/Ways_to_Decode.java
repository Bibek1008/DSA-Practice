package DP;

public class Ways_to_Decode {

    static int number_of_ways(String s,int idx,int []dp){


        if (idx <= 0) return 1;        // reached before start → valid decoding

        if(dp[idx]!=-1){
            return dp[idx];
        }


        int not_combine=0;

        int combine=0;

        if(s.charAt(idx)!='0'){
            not_combine=number_of_ways(s,idx-1,dp);
        }





        if(s.charAt(idx-1)=='1'|| (s.charAt(idx-1)=='2' && s.charAt(idx)<='6')){

            combine=number_of_ways(s,idx-2,dp);
        }

        return dp[idx]=not_combine+combine;


    }


    public static void main(String[] args) {


        String number="12";
        int n=number.length();

        int[] dp =new int[n];

        for(int i=0;i<n;i++){
            dp[i]=-1;
        }

        System.out.println(number_of_ways(number,number.length()-1,dp));

    }
}
