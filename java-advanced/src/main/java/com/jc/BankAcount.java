package com.jc;

import java.io.IOException;

public class BankAcount {

    private double balance;

//    public BankAcount(double balance) {
//
//    }
    //Versement
    public void deposit(double amount) throws InvalidAmountException{
        if(amount <=0) {
            throw new InvalidAmountException();

            //            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        balance += amount;

    }
    public double getBalance() {
        return balance;
    }
}
