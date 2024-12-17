package day42;

public class Rearrange_Array {

    public int[] rearrangeArray(int[] nums) {

        int arr[] = new int[nums.length];


        for (int i = 0,j = 0,k = 1; i < nums.length; i++) {

            if(nums[i] > 0){
                arr[j] = nums[i];
                j += 2;
            }else {
                arr[k] = nums[i];
                k += 2;
            }


        }

        return arr;


    }


    public static void main(String[] args) {
        Rearrange_Array rearrangeArray = new Rearrange_Array();
        int arr[]  = {3,1,-2,-5,2,-4};

        arr  = rearrangeArray.rearrangeArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
