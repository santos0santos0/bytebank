package com.santos0santos0.bytebank.test;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("Gol", 200000);

        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.getYear());

        Car secondCar = new Car("Tesla", 2021, 1000000);

        System.out.println(secondCar.getModel());
        System.out.println(secondCar.getPrice());
        System.out.println(secondCar.getYear());

    }

}
