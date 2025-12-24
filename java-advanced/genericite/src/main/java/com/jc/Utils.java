package com.jc;

public class Utils {
    
    public static <T extends Comparable<T>> T min(T first, T second){

        return (first.compareTo(second) < 0) ? first : second;
    }

    public static <K, V> void  printKeyValue(K key, V value){
        System.out.println(key+ " = "+value);
    }
    public static void printBankAccount(BankAccount bankAccount){
        System.out.println(bankAccount);
    }
    public static void printBankAccount(GenericList<? extends BankAccount> bankAccounts){

    }

}
