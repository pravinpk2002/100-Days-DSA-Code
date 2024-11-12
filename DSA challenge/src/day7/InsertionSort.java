package day7;

import arrayFunctions.CommonMethods;

public class InsertionSort extends CommonMethods {
    void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int element=arr[i];
            while(j>=0 && element<arr[j]){
               arr[j+1]= arr[j];
                j--;
            }

            arr[j+1]=element;

        }
    }


    public static void main(String[] args) {
        InsertionSort insertionSort=new InsertionSort();
        int arr[]={6,3,9,5,8};

        System.out.println("Array before sort : ");
        insertionSort.display(arr);

        insertionSort.insertionSort(arr);

        System.out.println("Array after sort : ");
        insertionSort.display(arr);


    }
}
