package day50;

public class Solution {
    //35. Search Insert Position

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int index = 0;

        while(start <= end){

            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                index = mid;
                end = mid - 1;
            }else{
                index = end + 1;
                start = mid + 1;
            }
        }

        return index;

    }


    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 0;

        System.out.println(searchInsert(arr,target));
    }

}
