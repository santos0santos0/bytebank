package com.santos0santos0.bytebank;

public class AuthenticationUtility {

    private int password;

    public boolean authentication(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
