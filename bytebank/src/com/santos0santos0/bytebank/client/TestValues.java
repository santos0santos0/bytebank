package com.santos0santos0.bytebank.client;

public class TestValues {

    public static void main(String[] args) {
        Account account = new Account(1337, 24226);

        // Conta inconsistente
        // account.setAgency(-50);
        //account.setNumber(-330);

        System.out.println(account.getAgency());
        System.out.println(account.getBalance());

        Account secondAccount = new Account(1337, 26549);

        System.out.println(Account.getTotal());
    }

}
