package com.jc;

import java.util.NoSuchElementException;

public class LinkedList {

    class Node{

       private int value;
        private Node next;

        public Node(int value){
            this.value = value ;
        }
    }


    private Node first; //reference qui pointe vers le premier nœud
    private Node last; //reference qui pointe vers le dernier nœud
    private int size;
    //addLast
    public void addLast(int number){
        Node node = new Node(number);

        if(isEmpty()){
            first= last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }


//    public int size(){}
    //addFirst
    public void addFirst(int number){
        Node node = new Node(number);
        if(isEmpty()){
            first = last = node;
        }else {
            node.next = first ;
            first = node;
        }
        size++;
    }

    //indexOf
    public int indexOf(int number){

        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == number)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    //contains
    public boolean contains(int number){

        return indexOf(number) != -1;
    }
    //removeFirst
    public void removeFist(){
        //Liste vide
        if(isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        //Liste avec un seul nœud
        if(first == last){
            first = last = null;

        }else{
            //Liste avec plusieurs nœuds
            //1→2→3
            var second = first.next;
            first.next = null;
            first = second;
        }
       size--;
    }
    public void removeLast(){
        //Liste vide
        if(isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        if(last == first){
            //Liste avec un seul nœud
            last = first = null;
        }else{
            //liste avec plusieurs elements
            //1->2->3
            last = getPrevious(last);
            last.next = null;
        }
        size--;
    }
    //size
   public int size(){
        return size;
   }
    //toArray
    public int[]  toArray(){
        int[]  array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //addLast
    //addFirst
    //indexOf
    //contains
    //removeFirst
    //removeLast
    //size
    //toArray


    private boolean isEmpty(){
        return first == null;
    }
    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }
}
