package com.santos0santos0.bytebank;

import com.santos0santos0.bytebank.bank.model.Account;
import com.santos0santos0.bytebank.bank.model.CurrentAccount;

public class TestLibs {

    public static void main(String[] args) {

        Account account = new CurrentAccount(123, 456);

        account.deposit(500.0);

        System.out.println(account.getBalance());

    }

}
