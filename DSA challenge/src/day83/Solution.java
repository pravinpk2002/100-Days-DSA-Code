package day83;

public class Solution {

//    494. Target Sum
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }


        if ((sum + target) % 2 != 0 || sum < Math.abs(target)) {
            return 0;
        }

        int subsetSum = (sum + target) / 2;
        return countSubsets(nums, subsetSum);
    }

    public int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];
    }
}
