package com.jc;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;

    private int count;
    private int front; //Avant
    private int rear; //Arrière


    public ArrayQueue(int size) {

        items = new int[size];
    }
    public void enqueue(int item){
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return items[front];
    }

    public boolean isFull(){
       return count == items.length;

    }
    public boolean isEmpty(){

        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
