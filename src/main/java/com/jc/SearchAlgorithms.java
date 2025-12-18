package com.jc;

public class SearchAlgorithms {
  //RECHERCHE SEQUENTIEL
    public static int linearSearch(int[] arr,int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
              return i;
            }
        }
        return -1;
    }
    //RECHERCHE DICHOTOMIQUE
    public static int binarySearch(int[] arr,int target) {
        int left = 0;
        var right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }

        return -1;
    }
}
