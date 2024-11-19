package day14;

import arrayFunctions.CommonMethods;

public class ArrayBasic extends CommonMethods {

    public static void main(String[] args) {

        ArrayBasic arrayBasic = new ArrayBasic();
        int[] arr1 = new int[5]; // Creates an array of size 5
        arr1[0] = 10;            // Manually assigning values
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        int[] arr2 = {10, 20, 30, 40, 50}; // Array of size 5, directly initialized

        int[] arr3 = new int[]{10, 20, 30, 40, 50}; // Array size determined by values provided

        arrayBasic.display(arr1);
        arrayBasic.display(arr2);
        arrayBasic.display(arr3);



    }
}
