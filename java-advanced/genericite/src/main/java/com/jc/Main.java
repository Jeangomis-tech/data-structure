package com.jc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List myList = new List();
//        myList.add(5);

        System.out.println(Utils.min(new BankAccount(18),new BankAccount(89)));
        System.out.println(Utils.min(8,9));

        Utils.printKeyValue("Nom","GOMIS");

//        myList.add();
    }
}