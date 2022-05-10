package com.santos0santos0.bytebank;

public class Manager extends Employee implements Authentication {

    private AuthenticationUtility authenticationUtility;

    public Manager() {
        this.authenticationUtility = new AuthenticationUtility();
    }

    @Override
    public double getBonus() {
        return super.getWage();
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
