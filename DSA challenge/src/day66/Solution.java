package day66;

import arrayFunctions.CommonMethods;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer num : nums2){

            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }

            stack.push(num);

        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }


        return nums1;
    }


    public static void main(String[] args) {



        Solution obj = new Solution();
        CommonMethods methods = new CommonMethods();
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};

        obj.nextGreaterElement(nums1,nums2);

        methods.display(nums1);

    }
}
