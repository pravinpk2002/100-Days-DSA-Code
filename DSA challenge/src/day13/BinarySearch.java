package day13;

import arrayFunctions.CommonMethods;

public class BinarySearch extends CommonMethods {

    int binarySearch(int arr[],int key){
        if(arr.length == 0){
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < key){
                low = mid + 1;
            }else if(arr[mid] > key){
                high = mid - 1;
            }else {
                return mid;
            }
        }


        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.display(arr);
        System.out.println(binarySearch.binarySearch(arr,9));

    }
}
