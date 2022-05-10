package com.santos0santos0.bytebank.client;

public class TestGetSet {

    public static void main(String[] args) {
        Account accountClient = new Account(1337, 24222);

        // accountClient.number = 1337;
        System.out.println(accountClient.getNumber());

        Client client = new Client();
        // accountClient.holder = "João Pedro";
        client.setName("João Pedro");

        accountClient.setHolder(client);

        System.out.println(accountClient.getHolder().getName());

        accountClient.getHolder().setJob("DevOps");

        System.out.println(accountClient.getHolder().getJob());

        Client cpf = accountClient.getHolder();
        cpf.setCpf("222.222.222-22");

        System.out.println(cpf.getCpf());

        //
        System.out.println(cpf);
        System.out.println(client);
        System.out.println(accountClient.getHolder());
    }

}
