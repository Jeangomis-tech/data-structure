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
        tree.insert(7);
        tree.insert(5);
        tree.insert(9);
        tree.insert(2);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(1);

        Tree tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(5);
        tree1.insert(9);
        tree1.insert(2);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(10);
        tree1.insert(1);
//        System.out.println(tree.equals(tree1));
////        tree.printNodesAtDistance(0);
//        System.out.println(tree.getNodesAtDistance(2));

//        System.out.println(tree.contains(5));
//        System.out.println(tree.contains(12));
//        System.out.println(factoriel(4));
//        tree.traverseInOrder();
//        tree.traversePostOrder();

//        System.out.println("Height : " + tree.height());
//        tree.traverseLevelOrder();

        int[] arr = {2,8,4,1,3};
        System.out.println(Arrays.toString(arr));
//        SortingAlgorithms.bubbleSort(arr);
//        SortingAlgorithms.selectionSort(arr);
//        SortingAlgorithms.insertionSort(arr);
//        SortingAlgorithms.mergeSort(arr);
        SortingAlgorithms.quickSort(arr,0,4);
//       SortingAlgorithms.bubbleSort(arr);

        // 4*3*2



    }

//    public static int factoriel(int n){
//        if(n == 0) return 1;
//
//        return n * factoriel(n-1);
//    }
}