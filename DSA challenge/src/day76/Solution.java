package day76;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

//    229. Majority Element II
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length / 3;
        for (int i : nums) {

            if(map.containsKey(i)){
                int count = map.get(i)+1;
                map.put(i,count);
            }else{
                map.put(i,1);
            }


        }

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])){
                if (map.get(nums[i]) > n){
                    list.add(nums[i]);
                    map.remove(nums[i]);
                }
            }
        }


        return list;
    }


    public static void main(String[] args) {

        int nums[] = {1,2};

        Solution obj = new Solution();
        System.out.println(obj.majorityElement(nums));
    }


}
