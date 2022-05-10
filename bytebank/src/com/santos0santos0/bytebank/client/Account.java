package com.santos0santos0.bytebank.client;

public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account() {

    }

    public Account(int agency, int number) {
        Account.total++;
        this.agency = agency;
        this.number = number;
        this.balance = 100;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean draw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account destiny) {
        if (this.balance >= value) {
            this.balance -= value;
            destiny.draw(value);
            return true;
        }
        return false;
    }

     public double getBalance() {
        return this.balance;
     }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        if(agency <= 0) {
            System.out.println("Error: Valores menores que 0 não permitido");
            return;
        }

        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println("Error: Valores menores que 0 não permitido");
            return;
        }

        this.number = number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getTotal() {
        return Account.total;
    }
}
