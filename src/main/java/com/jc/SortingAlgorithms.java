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
        System.arraycopy(arr, 0, left, 0, middle);
        var right = new int[arr.length-middle];
        if (arr.length - middle >= 0) System.arraycopy(arr, middle, right, middle - middle, arr.length - middle);
        // Trier
        mergeSort(left);
        mergeSort(right);

        //Fusion
        merge(left,right,arr);

        System.out.println(Arrays.toString(arr));
    }
//Tri rapide
    public static void quickSort(int[] arr, int start, int end){

        if(start >= end) return;
       //partition
        var limit = partition(arr,start,end);
        //trier à gauche
        quickSort(arr,start,limit-1);
        //trier à droite
        quickSort(arr,limit+1,end);
//        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int start, int end){
        var pivot = arr[end];
        var limit = start-1;
        for(int i =start; i<= end; i++){
            if(arr[i] <= pivot){
                swap(arr,i, ++limit);
            }
        }
        return limit;

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
