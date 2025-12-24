package com.jc;

public class Utils {
    
    public static <T extends Comparable<T>> T min(T first, T second){

        return (first.compareTo(second) < 0) ? first : second;
    }

}
