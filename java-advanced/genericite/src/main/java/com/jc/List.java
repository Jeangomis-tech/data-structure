package com.jc;

public class List {
    private int[] items = new int[5];

    private int count ;

    public void add(int item){
        items[count++]=item;
    }

    public int get(int index){
        return items[index];
    }
}
