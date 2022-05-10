package com.santos0santos0.bytebank.bank.special;

import com.santos0santos0.bytebank.bank.model.Account;

public class AccountSpecial extends Account {

    public AccountSpecial(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }
}
