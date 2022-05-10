package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.special.AccountSpecial;

public class TestAccountSpecial {

    public static void main(String[] args) {

        AccountSpecial accountSpecial = new AccountSpecial(111, 2222);

        accountSpecial.deposit(100);

        System.out.println(accountSpecial.getBalance());

    }

}
