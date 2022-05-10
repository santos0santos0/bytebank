package com.santos0santos0.bytebank.bank.model;

public class CurrentAccount extends Account implements Taxable {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void draw(double value) throws BalanceException {
        double valueDraw = value + 0.2;
        super.draw(valueDraw);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public double getValueTaxes() {
        return super.balance * 0.01;
    }

    @Override
    public String toString() {
        return "Conta corrente - " + super.toString();
    }
}
