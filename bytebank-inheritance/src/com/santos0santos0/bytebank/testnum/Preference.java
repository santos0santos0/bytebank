package com.santos0santos0.bytebank.testnum;

public enum Preference {

    MIN(1), NORMAL(5), MAX(10);

    private int value;

    Preference(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
