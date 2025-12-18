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

    //Tri par selection
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

    //Tri par insertion
    public static void insertionSort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
    //Tri par fusion
    public static void mergeSort(int[] arr){

        if(arr.length < 2) return;
        //diviser
        var middle = arr.length/2;

        var left = new int[middle];
        for(int i = 0; i< middle; i++){
            left[i] = arr[i];
        }
        var right = new int[arr.length-middle];
        for(int i = middle; i< arr.length; i++){
            right[i-middle] = arr[i];
        }
        // Trier
        mergeSort(left);
        mergeSort(right);

        //Fusion
        merge(left,right,arr);

        System.out.println(Arrays.toString(arr));
    }



    private static void merge(int[] left,int[] right, int[] result){
        int leftIndex =0;
        int rightIndex =0;
        int resultIndex =0;
        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] <= right[rightIndex]){
                result[resultIndex++] = left[leftIndex++];
            }else {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        while(leftIndex < left.length){
            result[resultIndex++] = left[leftIndex++];
        }
        while(rightIndex < right.length){
            result[resultIndex++] = right[rightIndex++];
        }

    }

    //Methode extraite
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
