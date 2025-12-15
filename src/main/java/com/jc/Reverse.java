package com.jc;

import java.util.Stack;

public class Reverse {

    public static String reverseString(String chaine){
        if (chaine == null){


            throw new IllegalArgumentException("chaine is null");
        }
        Stack<Character> stack = new Stack<>();
        for(char c : chaine.toCharArray()){
            stack.push(c);
        }
        //Pop element et prepare le résultat
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop()) ;
        }
        return result.toString();
    }
}
