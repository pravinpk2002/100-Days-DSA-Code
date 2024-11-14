package day9;

import arrayFunctions.CommonMethods;

public class QuickSort extends CommonMethods {

    int partition(int arr[], int start, int end){

        int i = start-1;
        for (int j = start; j < end; j++) {

            if(arr[j]<=arr[end]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        int temp = arr[end];
        arr[end] = arr[i + 1];
        arr[i + 1] = temp;


        return i;
    }

    void quickSort(int arr[], int start, int end){

        if(start >= end)
            return;
        int pivotIndex =partition(arr, start, end);

        quickSort( arr, start, pivotIndex);//left part of pivot

        quickSort( arr, pivotIndex + 1, end);//right part of pivot

    }

    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();

        int arr[] = { 10, 80,40, 30, 90, 40};

        System.out.println("Array before sort : ");
        quickSort.display(arr);

        quickSort.quickSort(arr,0,arr.length-1);

        System.out.println("Array after sort : ");
        quickSort.display(arr);



    }

}
