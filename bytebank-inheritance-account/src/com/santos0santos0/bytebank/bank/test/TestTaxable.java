package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.CurrentAccount;
import com.santos0santos0.bytebank.bank.model.LifeInsurance;
import com.santos0santos0.bytebank.bank.model.Taxes;

public class TestTaxable {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(222, 333);
        currentAccount.deposit(100.0);

        LifeInsurance lifeInsurance = new LifeInsurance();

        Taxes taxes = new Taxes();
        taxes.register(currentAccount);
        taxes.register(lifeInsurance);

        // Total de impostos
        System.out.println(taxes.getTotalTaxes());
    }

}
