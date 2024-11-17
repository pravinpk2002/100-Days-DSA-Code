package day12;

import arrayFunctions.CommonMethods;

public class LinearSearch extends CommonMethods {

    int LinearSearch(int arr[], int key){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40};
        LinearSearch linearSearch = new LinearSearch();
        int key = 4;
        linearSearch.display(arr);
        int index = linearSearch.LinearSearch(arr, key);

        if (index > -1){
            System.out.println("Found at index : "+ index);
        }
        else
            System.out.println("Not found");

    }
}
