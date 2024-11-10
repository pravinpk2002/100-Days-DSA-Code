package day5;

import arrayFunctions.CommonMethods;

public class BubbleSort extends CommonMethods {
    void bubbleSort(int arr[]){
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }


    }

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={56,89,7,6,1,4};
        System.out.println("Orginal array");
        bubbleSort.display(arr);

        bubbleSort.bubbleSort(arr);

        System.out.println("Sorted array");
        bubbleSort.display(arr);


    }
}
