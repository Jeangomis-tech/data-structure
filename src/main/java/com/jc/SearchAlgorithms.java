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

    //RECHERCHE RECURSIVE
    public static int recursiveSearch(int[] arr, int target) {
       return recursiveSearch(arr,target,0,arr.length-1);
    }

    private static  int recursiveSearch(int[] arr,int target, int left, int right){
        if(left > right){
            return -1;
        }
        var middle = (left + right) / 2;
        if(arr[middle] == target){
            return middle;
        }
        if(target< arr[middle]){
            return recursiveSearch(arr,target,left,middle-1);
        }else{
            return recursiveSearch(arr,target,middle+1,right);
        }
    }

    //RECHERCHE EXPONENTIELLE
    public  static int exponentialSearch(int[] arr, int target) {
       int limit =1;
       while(limit<arr.length && arr[limit] < target){
            limit *=2;
       }
       int left = limit/2;

       int right = Math.min(limit, arr.length-1);
       return recursiveSearch(arr,target,left,right);
    }

}
