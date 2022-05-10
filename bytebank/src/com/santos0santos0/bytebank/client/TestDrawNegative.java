package com.santos0santos0.bytebank.client;

public class TestDrawNegative {

    public static void main(String[] args) {
        Account accountClient = new Account(1337, 24226);
        accountClient.deposit(100);
        System.out.println(accountClient.draw(200));

        System.out.println(accountClient.getBalance());

    }

}
