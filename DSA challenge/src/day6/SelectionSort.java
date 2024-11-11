package day6;

import arrayFunctions.CommonMethods;

public class SelectionSort extends CommonMethods {
    void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int index=i;
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[index]>arr[j]){
                        index=j;
                    }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort=new SelectionSort();
        int arr[]={6,3,9,5,8};
        System.out.println("Array before sort : ");
        selectionSort.display(arr);

        selectionSort.selectionSort(arr);

        System.out.println("Array after sort : ");
        selectionSort.display(arr);

    }
}
