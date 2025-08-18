package DP;

import java.util.List;

public class Coin_change {

    public static void main(String[] args) {

        int totalSum = 4;  // target sum
        List<Integer> coins = List.of(1, 2, 3);
        int n = coins.size();

        int[] prev = new int[totalSum + 1];

        // Base case for idx = 0
        for (int i = 0; i <= totalSum; i++) {
            if (i % coins.get(0) == 0) {
                prev[i] = 1;
            } else {
                prev[i] = 0;
            }
        }

        // Fill table using only two arrays
        for (int idx = 1; idx < n; idx++) {
            int[] curr = new int[totalSum + 1];  // fresh row each iteration
            for (int currSum = 0; currSum <= totalSum; currSum++) {
                int pick = 0;
                if (currSum >= coins.get(idx)) {
                    pick = curr[currSum - coins.get(idx)];  // stay in same row (unbounded coins)
                }
                int notPick = prev[currSum];  // take previous row
                curr[currSum] = pick + notPick;
            }
            prev = curr;  // move to next row
        }

        System.out.println(prev[totalSum]);
    }
}
