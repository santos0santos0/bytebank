package com.santos0santos0.bytebank;

public class BonusControl {

    private double sum;

    public void register(Employee employee) {
        this.sum += employee.getBonus();
    }

    public double getSum() {
        return sum;
    }
}
