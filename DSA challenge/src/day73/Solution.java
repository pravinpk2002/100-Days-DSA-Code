package day73;

public class Solution {

//    31. Next Permutation
    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        while( i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0){
            int j = nums.length - 1;

            while(j >=0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);

    }

    private void reverse(int arr[], int start){
        int j=arr.length - 1;
        while(start < j){
            swap(arr,start,j);
            j--;
            start++;
        }
    }

    private void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
