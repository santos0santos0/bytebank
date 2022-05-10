package com.santos0santos0.bytebank.test;

public class Car {

    private String model;
    private int year;
    private int price;

    public Car(String model, int year, int price) {
        if (model != null) {
            this.model = model;
        } else {
            System.out.println("O modelo não pode estar vazio, por padrão ele será gol");
            this.model = "Gol";
        }

        if (year <= 1891 && year <= 0) {
            this.year = year;
        } else {
            System.out.println("Ano inválido, o ano padrão é 2022");
            this.year = 2022;
        }

        if (price > 5000) {
            this.price = price;
        } else {
            System.out.println("Preço abaixo do esperado, o padrão é 1000000");
            this.price = 1000000;
        }
    }

    public Car(String model, int price) {
        this(model, 2022, price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
