package com.prospring.gof.structural_patterns.bridge;

public class DemirBank extends Bank{
    public DemirBank(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.println("Open your account with Demir bank");
        return account;
    }
}
