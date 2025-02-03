package day90;

class Solution {
//    1248. Count Number of Nice Subarrays
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, oddCount = 0, result = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 == 1) {
                oddCount++;
            }


            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++;
            }


            int temp = left;
            while (oddCount == k && nums[temp] % 2 == 0) {
                result++;
                temp++;
            }

            if (oddCount == k) {
                result++;
            }
        }

        return result;
    }
}
