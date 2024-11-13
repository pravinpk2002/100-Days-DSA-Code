package day8;

import arrayFunctions.CommonMethods;

public class MergeSort extends CommonMethods {

    void merge(int arr[],int start,int mid,int end){

        int i = start;
        int j = mid +1;
        int k;
        int temp[]=new int[(end-start)+1];

        for(k=0; k<temp.length;k++){
            if((i<=mid && j>end) || (i<=mid && arr[i]<arr[j]))
                temp[k]=arr[i++];
            else
                temp[k]=arr[j++];
        }

        int x=0;
        int y=start;
        while(x<k)
            arr[y++]=temp[x++];

    }

    void divid(int arr[],int start,int end){
        if(start == end)
            return;
        int mid = (start + end ) / 2;

        divid(arr,start,mid);
        divid(arr,mid+1,end);

        merge(arr,start,mid,end);


    }
    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        int arr[]={38,27,5,43,10};

        System.out.println("Array before sort : ");
        mergeSort.display(arr);
        mergeSort.divid(arr,0, arr.length-1);
        System.out.println("Array after sort : ");
        mergeSort.display(arr);
    }
}
