package com.jc;

import java.io.IOException;

public class MyBankApplication {
    public static void start() throws InvalidAmountException {

        BankAcount account  = new BankAcount();

        try {
            account.deposit(-80);
        } catch (InvalidAmountException e) {
//            System.out.println("Logging !");
            e.printStackTrace();

        }
    }
}
