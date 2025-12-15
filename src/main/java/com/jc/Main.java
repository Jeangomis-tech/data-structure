package com.jc;

import java.util.Arrays;
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

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        var top =  stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top =stack.peek();
        System.out.println(top);
        System.out.println(stack);

        System.out.println(Reverse.reverseString(null));





    }
}