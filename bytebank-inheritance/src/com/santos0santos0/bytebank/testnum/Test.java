package com.santos0santos0.bytebank.testnum;

public class Test {

    public static void main(String[] args) {

        Preference min = Preference.MIN;
        Preference normal = Preference.NORMAL;
        Preference max = Preference.MAX;

        System.out.println(min.name() + " = " + min.getValue());
        System.out.println(normal.name() +  " = " + normal.getValue());
        System.out.println(max.name() + " = " + max.getValue());

    }
}
