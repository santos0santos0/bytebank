package com.santos0santos0.bytebank.bank.model;

public class SavingsAccount extends Account {

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public String toString() {
        return "Conta poupança - " + super.toString();
    }
}
