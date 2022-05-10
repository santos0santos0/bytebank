package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.BalanceException;
import com.santos0santos0.bytebank.bank.model.CurrentAccount;
import com.santos0santos0.bytebank.bank.model.SavingsAccount;

/**
 *
 * Class main to tests.
 *
 * @author João Pedro Araújo (santos0santos0)
 * @version 0.1
 */
public class TestAccount {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        currentAccount.deposit(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.deposit(200.0);

        try {
            currentAccount.transfer(10.0, savingsAccount);
        } catch (BalanceException e) {
            System.out.println("Exception " + e.getMessage());
        }

        System.out.println("Conta corrente: " + currentAccount.getBalance());
        System.out.println("Conta poupança: " + savingsAccount.getBalance());

    }

}
