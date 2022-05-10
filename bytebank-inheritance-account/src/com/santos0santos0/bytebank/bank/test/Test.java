package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.SavingsAccount;

public class Test {

    public static void main(String[] args) {

        SavingsAccount[] savingsAccounts = new SavingsAccount[10];
        SavingsAccount firstAccount = new SavingsAccount(11, 22);
        SavingsAccount secondAccount = new SavingsAccount(33, 44);

        savingsAccounts[0] = firstAccount;
        savingsAccounts[4] = secondAccount;

        try {
            System.out.println(savingsAccounts[1].getNumber());
        } catch (NullPointerException e) {
            System.out.println("Posição nula");
        }

    }

}
