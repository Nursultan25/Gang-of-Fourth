package com.prospring.gof.generating_patterns.factory;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT!");
    }
}
