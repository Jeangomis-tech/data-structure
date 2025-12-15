package com.jc;

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
    //addLast
    public void addLast(int number){
        Node node = new Node(number);

        if(isEmpty()){
            first= last = node;
        }else{
            last.next = node;
            last = node;
        }
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
}
