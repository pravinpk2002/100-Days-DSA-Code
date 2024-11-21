package day16;

import arrayFunctions.CommonMethods;

public class ArrayProblem extends CommonMethods {

    void movesZeros(int nums[]){

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }


        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

    }


    void reverse(int arr[],int start,int end){
        int j = end;
        for (int i = start; i <= (start+end)/2; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    void rotate(int[] nums, int k) {
       reverse(nums,0, nums.length-1);
       reverse(nums,0,k-1);
       reverse(nums,k, nums.length-1);
    }


    public static void main(String[] args) {
//        int arr[] = { 0,1,0,3,12 };
        ArrayProblem arrayProblem = new ArrayProblem();
        int arr[] = {1,2,3,4,5,6,7};
        arrayProblem.display(arr);
//        arrayProblem.movesZeros(arr);
        arrayProblem.rotate(arr,3);

        arrayProblem.display(arr);

    }
}
