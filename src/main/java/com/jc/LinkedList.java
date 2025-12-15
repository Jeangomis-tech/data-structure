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

    public void addLast(int number){
        Node node = new Node(number);

        if(first==null){
            first= last = node;
        }else{
            last.next = node;
            last = node;
        }
    }

    //addLast
    //addFirst
    //indexOf
    //contains
    //removeFirst
    //removeLast
    //size
    //toArray
}
