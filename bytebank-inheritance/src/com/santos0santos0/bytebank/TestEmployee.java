package com.santos0santos0.bytebank;

public class TestEmployee {

    public static void main(String[] args) {
        Manager employee = new Manager();

        employee.setName("Nico");
        employee.setCpf("222-222-222.22");
        employee.setWage(3000);

        System.out.println(employee.getName());
        System.out.println(employee.getCpf());
        System.out.println(employee.getWage());
        System.out.println(employee.getBonus());
    }

}
