package com.santos0santos0.bytebank;

public class Account {

    double balance;
    int agency;
    int number;
    String holder;

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean draw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account destiny) {
        if (this.balance >= value) {
            this.balance -= value;
            destiny.draw(value);
            return true;
        }
        return false;
    }
}
