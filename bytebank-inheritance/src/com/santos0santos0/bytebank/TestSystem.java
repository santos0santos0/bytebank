package com.santos0santos0.bytebank;

public class TestSystem {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(2222);

        Administrator administrator = new Administrator();
        administrator.setPassword(3333);

        Client client = new Client();
        client.setPassword(2222);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.authentication(manager);
        internalSystem.authentication(administrator);
        internalSystem.authentication(client);
    }

}
