package com.santos0santos0.bytebank;

public class TestMethod {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 100;
        firstAccount.deposit(50);
        System.out.println(firstAccount.balance);

        //
        boolean draw = firstAccount.draw(20);
        System.out.println(firstAccount.balance);
        System.out.println(draw);

        //
        Account secondAccount = new Account();
        secondAccount.deposit(1000);

        //
        boolean transferSuccess = secondAccount.transfer(3000, firstAccount);
        if (transferSuccess) {
            System.out.println("Transferência feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }

        System.out.println(secondAccount.balance);
        System.out.println(firstAccount.balance);
    }

}
