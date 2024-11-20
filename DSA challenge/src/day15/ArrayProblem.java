package day15;

import arrayFunctions.CommonMethods;

public class ArrayProblem extends CommonMethods {

    int largest(int arr[]){

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }

        }

        return largest;

    }
    int secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }

        }

        return secondLargest;
    }

    public int removeDuplicates(int[] nums) {
        int k=0;
        if(nums.length==0){
            return k;
        }else if(nums.length<2){
            k=1;
            return k;
        }

        k=1;
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }

        }


        return k;

    }
    public static void main(String[] args) {
        int arr[] = {10, 80, 50, 40, 30, 70};

        ArrayProblem arrayProblem = new ArrayProblem();
        arrayProblem.display(arr);
        System.out.println("Largest number "+arrayProblem.largest(arr));
        System.out.println("Second Largest number "+arrayProblem.secondLargest(arr));
    }
}
