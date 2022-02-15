package com.prospring.gof.structural_patterns.bridge;

public class CurrentAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("Opened: Current account!");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("Saving account!");
    }
}
