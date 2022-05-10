package com.santos0santos0.bytebank;

public class Administrator extends Employee implements Authentication {

    private AuthenticationUtility authenticationUtility;

    public Administrator() {
        this.authenticationUtility = new AuthenticationUtility();
    }

    @Override
    public double getBonus() {
        return 50;
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
