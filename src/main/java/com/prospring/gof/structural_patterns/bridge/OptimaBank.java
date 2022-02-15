package com.prospring.gof.structural_patterns.bridge;

public class OptimaBank extends Bank{
    public OptimaBank(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.println("Open your account with Optima bank");
        return account;
    }
}
