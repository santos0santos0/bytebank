package com.santos0santos0.bytebank.bank.model;

/**
 * Class model for account.
 *
 * @author João Pedro Araújo (santos0santos0)
 * @version 0.1
 */
public abstract class Account {

    protected double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    /**
     * Constructor for initializing object from agency and number.
     *
     * @param agency
     * @param number
     */
    public Account(int agency, int number) {
        Account.total++;
        this.agency = agency;
        this.number = number;

        if (agency < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }

        if (number < 1) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
    }

    public abstract void deposit(double value);

    /**
     * The amount must be greater than the balance.
     *
     * @param value
     * @throws BalanceException
     */
    public void draw(double value) throws BalanceException {
        if (this.balance < value) {
            throw new BalanceException("Saldo: " + this.balance + ", Valor: " + value);
        }

        this.balance -= value;
    }

    public void transfer(double value, Account destiny) throws BalanceException {
        this.draw(value);
        destiny.deposit(value);
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

    @Override
    public String toString() {
        return "Número: " + this.number + ", Agência: " + this.agency + ", Saldo: " + this.balance;
    }

}
