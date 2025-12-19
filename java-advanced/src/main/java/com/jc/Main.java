package com.jc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        try{
//            FileReader reader = new FileReader("file.txt");
//            System.out.println("file readed");
//        }catch(FileNotFoundException e){
//
//            System.out.println(e.getMessage());
//        }

      ;
//        System.out.println( quiz());
        try {
            MyBankApplication.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
   static String quiz(){
        try{
            return "try";
        }catch(Exception e){
            return "catch";
        }finally{
            return "finally";
        }
    }
}