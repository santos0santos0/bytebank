package com.santos0santos0.bytebank.client;

public class TestAccountNoClient {

    public static void main(String[] args) {
        Account account = new Account(1337, 24227);
        System.out.println(account.getBalance());

        account.setHolder(new Client());

        account.getHolder().setName("Marcelo");

        System.out.println(account.getHolder().getName());
    }

}
