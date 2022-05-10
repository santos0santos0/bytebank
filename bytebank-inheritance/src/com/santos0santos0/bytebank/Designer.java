package com.santos0santos0.bytebank;

public class Designer extends Employee {

    @Override
    public double getBonus() {
        System.out.println("Designer");
        return 200;
    }

}
