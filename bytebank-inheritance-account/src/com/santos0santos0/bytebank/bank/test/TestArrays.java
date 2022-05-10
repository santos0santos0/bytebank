package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.CurrentAccount;

public class TestArrays {

    public static void main(String[] args) {

        int[] ages = new int[10];

        ages[0] = 10;
        ages[1] = 29;
        ages[3] = 90;
        ages[4] = 21;

        System.out.println(ages[1]);

        CurrentAccount[] currentAccounts = new CurrentAccount[10];
        CurrentAccount currentAccount = new CurrentAccount(100, 200);

        currentAccounts[0] = currentAccount;

        System.out.println(currentAccounts[0].getNumber());

        int[] refs = {1, 2};
        refs[0] = 10;
        refs[1] = 20;

        System.out.println(refs.length);
        System.out.println(refs[1]);

    }

}
