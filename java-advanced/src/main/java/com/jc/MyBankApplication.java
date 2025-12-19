package com.jc;

import java.io.IOException;

public class MyBankApplication {
    public static void start() throws IOException {

        BankAcount account  = new BankAcount();

        try {
            account.deposit(-80);
        } catch (IOException e) {
            System.out.println("Logging !");
            throw e;

        }
    }
}
