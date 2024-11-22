package day17;

import arrayFunctions.CommonMethods;

import java.util.HashMap;
import java.util.Map;

public class ArrayProblem extends CommonMethods {
    public int maxProfit(int[] prices) {
            int maxProfit=0;
            int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }

            if(prices[i] - buyPrice > maxProfit)
                maxProfit = prices[i] - buyPrice;

        }

        return maxProfit;

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];

    }
    public static void main(String[] args) {

        ArrayProblem arrayProblem = new ArrayProblem();
//        int arr[] = {7,6,4,3,1};
//        arrayProblem.display(arr);

//        System.out.println(arrayProblem.maxProfit(arr));;

        int nums[]= { 2,7,11,15};

        arrayProblem.display(nums);
        int arr2[] = arrayProblem.twoSum(nums,17);

        arrayProblem.display(arr2);

    }
}
