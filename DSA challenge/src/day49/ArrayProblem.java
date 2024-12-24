package day49;

public class ArrayProblem {
    //Floor in a Sorted Array
    static int findFloor(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low <= high){
            int mid = low + ( high - low) / 2;

            if (arr[mid] == k){
                return mid;
            }
            if (arr[mid] < k){
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int k = 5;

        System.out.println(findFloor(arr,k));
    }
}
