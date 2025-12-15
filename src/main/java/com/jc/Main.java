package com.jc;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(4);
        System.out.println(Arrays.toString(list.toArray()));

    }
}