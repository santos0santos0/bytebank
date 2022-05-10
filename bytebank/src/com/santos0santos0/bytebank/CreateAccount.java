package com.santos0santos0.bytebank;

public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;

        System.out.println("Saldo primeira conta: " + firstAccount.balance);

        firstAccount.balance += 100;
        System.out.println("Saldo primeira conta: " + firstAccount.balance);

        Account secondAccount = new Account();

        secondAccount.balance = 50;
        System.out.println("Saldo segunda conta: " + secondAccount.balance);

        /* System.out.println("A segunda conta está na agência: " + secondAccount.agency); */

        secondAccount.agency = 146;
        System.out.println("Agora a segunda conta está na agência: " + secondAccount.agency);

    }

}
