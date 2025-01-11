package day67;

import arrayFunctions.CommonMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int arr[] = new int[n];

        Arrays.fill(arr,-1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n*2; i++) {

            while(!stack.isEmpty() && nums[stack.peek()] < nums[ i % n]){
                arr[stack.pop()] = nums[i % n];
            }

            if (i < n) stack.push(i);

        }

        return arr;
    }

    public static void main(String[] args) {
        CommonMethods m = new CommonMethods();

        Solution obj = new Solution();
        int arr[] = {5,4,3,2,1};
        m.display(arr);

        arr=obj.nextGreaterElements(arr);

        m.display(arr);
    }

}
