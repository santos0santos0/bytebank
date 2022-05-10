package com.santos0santos0.bytebank;

public class TestManager {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.setName("João Pedro");
        manager.setCpf("222.222.222-22");
        manager.setWage(5000.0);
        manager.setPassword(1234567);

        System.out.println(manager.getName());
        System.out.println(manager.getCpf());
        System.out.println(manager.getWage());

        boolean authentication = manager.authentication(1234567);

        System.out.println(authentication);
        System.out.println(manager.getBonus());

    }

}
