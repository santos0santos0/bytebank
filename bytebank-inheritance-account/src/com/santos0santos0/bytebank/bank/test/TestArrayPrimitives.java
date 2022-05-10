package com.santos0santos0.bytebank.bank.test;

public class TestArrayPrimitives {

    public static void main(String[] args) {

        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i * i;
            System.out.println(ages[i]);
        }

    }

}
