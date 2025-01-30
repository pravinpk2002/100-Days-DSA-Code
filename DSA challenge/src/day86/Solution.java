package day86;

import arrayFunctions.CommonMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // 18. 4Sum
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();


        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n-3; i++) {

            if (i>0 && nums[i]== nums[i-1])
                continue;

            for (int j = i+1; j < n-2; j++) {

                if (j> i+1 && nums[j] == nums[j-1])
                    continue;

                int k = j+1;
                int p = n-1;

                while(k < p){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[p];

                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[p]));

                        while (k < p && nums[k] == nums[k + 1]) k++;
                        while (k < p && nums[p] == nums[p - 1]) p--;

                        k++;
                        p--;
                    } else if (sum < target) {
                    k++;
                } else {
                    p--;
                }

                }

            }

        }
        return list;
    }


}
