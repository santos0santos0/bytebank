package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.Client;
import com.santos0santos0.bytebank.bank.model.CurrentAccount;
import com.santos0santos0.bytebank.bank.model.SavingsAccount;

public class TestObject {

    public static void main(String[] args) {

        // System.out.println("x");
        // System.out.println(1);
        // System.out.println(1.0);
        // System.out.println(true);

        CurrentAccount currentAccount = new CurrentAccount(222, 333);
        SavingsAccount savingsAccount = new SavingsAccount(444, 555);
        Client client = new Client();

        System.out.println(currentAccount);
        System.out.println(savingsAccount);

        println();
    }

    static void println() {
    }

    static void println(int a) {
        System.out.println(a);
    }

    static void println(String a) {
        System.out.println(a);
    }

    static void println(double a) {
        System.out.println(a);
    }

    static void println(boolean a) {
        System.out.println(a);
    }

    static void println(Object a) {
        System.out.println(a);
    }

}
