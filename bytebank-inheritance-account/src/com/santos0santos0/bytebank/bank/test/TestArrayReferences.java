package com.santos0santos0.bytebank.bank.test;

import com.santos0santos0.bytebank.bank.model.Account;
import com.santos0santos0.bytebank.bank.model.CurrentAccount;
import com.santos0santos0.bytebank.bank.model.SavingsAccount;

public class TestArrayReferences {

    public static void main(String[] args) {

        Account[] references = new Account[5];
        
        CurrentAccount firstAccount = new CurrentAccount(111, 222);
        SavingsAccount secondAccount = new SavingsAccount(333, 444);
        CurrentAccount thirdAccount = new CurrentAccount(444, 555);

        references[0] = firstAccount;
        references[1] = secondAccount;
        references[2] = thirdAccount;

        System.out.println(references[1].getNumber());

        CurrentAccount ref = (CurrentAccount) references[0]; // type cast

        System.out.println(ref.getNumber());
        System.out.println(secondAccount.getNumber());

    }

}
