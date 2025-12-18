package com.jc;

import java.util.Arrays;

public class SortingAlgorithms {
    //Bubble sorting
    public static void bubbleSort(int[] arr){
        boolean isSorted;
        for(int i = 0; i< arr.length; i++){
            isSorted = true;
            for(int j = 1; j< arr.length -i; j++){
                if(arr[j] < arr[j-1]){
                  swap(arr,j-1,j);
                  isSorted = false;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        

    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
