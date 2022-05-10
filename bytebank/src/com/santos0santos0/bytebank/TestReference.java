package com.santos0santos0.bytebank;

public class TestReference {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;

        System.out.println("Saldo da primeira conta: " + firstAccount.balance);

        Account secondAccount = firstAccount;
        // secondAccount.balance = 400;

        System.out.println("Saldo da segunda conta: " + secondAccount.balance);

        secondAccount.balance += 100;

        System.out.println("Novo saldo da segunda conta: " + secondAccount.balance);
        System.out.println(firstAccount.balance);

        if (firstAccount == secondAccount) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }
    }

}
