package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.Account;
import com.santos0santos0.bytebank.bank.model.BalanceException;
import com.santos0santos0.bytebank.bank.model.CurrentAccount;

public class TestDraw {

    public static void main(String[] args) {
        Account account = new CurrentAccount(123, 321);

        account.deposit(200.0);

        try {
            account.draw(210.0);
        } catch (BalanceException e) {
            System.out.println("Exception " + e.getMessage());
        }

        System.out.println(account.getBalance());
    }

}
