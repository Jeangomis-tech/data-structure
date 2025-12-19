package com.jc;

import java.io.IOException;

public class MyBankApplication {
    public static void start() throws BankAccountException {

        BankAcount account  = new BankAcount();

        try {
            account.deposit(-80);
        } catch (BankAccountException e) {
//            System.out.println("Logging !");
            System.out.println(e.getCause().getMessage());

        }
    }
}
