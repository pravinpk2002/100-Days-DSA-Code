package day80;

import java.util.Arrays;

public class DynamicProgramming {
    static long[] memo;
    static long topDown(int n) {
        if (memo == null || memo.length <= n) {
            memo = new long[n + 1];
            Arrays.fill(memo, -1);
        }

        if (n <= 1) {
            return n;
        }


        if (memo[n] != -1) {
            return memo[n];
        }


        memo[n] = topDown(n - 1) + topDown(n - 2);
        return memo[n];

    }



    static long bottomUp(int n) {
        if (n <= 1) {
            return n;
        }


        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;


        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }


        return dp[n];
    }
}
