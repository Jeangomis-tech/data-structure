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
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int minIndex =i;
            for(int j = i; j< arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            swap(arr,minIndex ,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    //Tri par selectyion
}
