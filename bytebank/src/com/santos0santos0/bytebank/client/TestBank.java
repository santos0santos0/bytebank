package com.santos0santos0.bytebank.client;

public class TestBank {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("João Pedro Araújo");
        client.setCpf("222.222.222-22");
        client.setJob("DevOps");

        Account account = new Account(1337, 24228);

        account.deposit(100);

        account.setHolder(client);

        System.out.println(account.getHolder().getName());
        System.out.println(account.getHolder().getCpf());
        System.out.println(account.getHolder().getJob());
        System.out.println(account.getBalance());
    }

}
