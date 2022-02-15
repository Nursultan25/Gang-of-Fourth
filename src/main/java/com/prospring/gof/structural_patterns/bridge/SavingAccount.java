package com.prospring.gof.structural_patterns.bridge;

public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("Opened: Saving account!");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("Saving account");
    }
}
