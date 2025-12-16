package com.jc;

public class Stack {

    private int[] items;
    private int count = 0;

    public Stack(int size) {
        items = new int[size];
    }
    //Ajouter un nouvel element à la pile
    public void push(int item){
        if(count == items.length){
            throw new StackOverflowError("Stack is full");
        }
        items[count++] = item;

    }
    //Dépiler le dernier element
    public int pop(){

        var value = peek();
        items[count--] = 0;
        return value;
    }
    //Retourne le dernier ellement sans depiler
    public int peek(){
        if(isEmpty()){
            throw new StackOverflowError("Stack is empty");
        }
        return items[count-1];

    }
    public boolean isEmpty(){
        return false;
    }
}
