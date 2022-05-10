package com.santos0santos0.bytebank;

public class InternalSystem {

    private int password = 2222;

    public void authentication(Authentication employeeAuthentication) {
        boolean login = employeeAuthentication.authentication(this.password);
        if (login) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }

}
