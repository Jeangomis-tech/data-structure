package com.jc;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        LinkedList list = new LinkedList();
//
//        list.addLast(2);
//        list.addLast(3);
//        list.addFirst(1);
//        list.addFirst(4);
//        System.out.println(Arrays.toString(list.toArray()));

//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack);
//        var top =  stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        top =stack.peek();
//        System.out.println(top);
//        System.out.println(stack);
//
//        System.out.println(Reverse.reverseString(null));

//        Queue<Integer> q = new ArrayDeque();
//
//        q.add(1); //equivalent q.offer(); La diff entre les deux offer() ne lance pas d'exception quand la file est pleine
//        q.add(2);
//        q.add(3);
//
//        int number =  q.remove();// equivalent .poll() La diff ne lance pas d'exception  quand la file est vide(return null)
//        System.out.println(number);
//        System.out.println(q);
//
//        int x =   q.peek();
//        System.out.println(x);

//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        arrayQueue.enqueue(1);
//        arrayQueue.enqueue(2);
//        arrayQueue.enqueue(3);

//        System.out.println(arrayQueue);
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue);
//        arrayQueue.enqueue(4);
//        arrayQueue.enqueue(5);
//        System.out.println(arrayQueue);
//        arrayQueue.enqueue(6);
//        System.out.println(arrayQueue);
//        System.out.println(arrayQueue.dequeue());
//        arrayQueue.enqueue(7);
//        System.out.println(arrayQueue);
//        System.out.println(arrayQueue.peek());

        Tree tree = new Tree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(1);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(3);
        tree.insert(10);
        System.out.println(tree.contains(5));
        System.out.println(tree.contains(12));





    }
}