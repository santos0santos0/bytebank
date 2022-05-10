package com.santos0santos0.bytebank;

public class Client implements Authentication {

    private AuthenticationUtility authenticationUtility;

    public Client() {
        this.authenticationUtility = new AuthenticationUtility();
    }

    @Override
    public boolean authentication(int password) {
        return this.authenticationUtility.authentication(password);
    }

    @Override
    public void setPassword(int password) {
        this.authenticationUtility.setPassword(password);
    }
}
