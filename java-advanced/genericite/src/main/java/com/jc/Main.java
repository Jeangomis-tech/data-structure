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

        BankAccount bankAccount = new BankAccount(18);

        Utils.printBankAccount(new SavingsAccount(50));
        Utils.printBankAccount(new GenericList<SavingsAccount>());
        Utils.printBankAccount(new GenericList<BankAccount>());
        Utils.printBankAccount(new GenericList<String>());
        Utils.printBankAccount(new GenericList<Object>());


//        myList.add();
    }
}