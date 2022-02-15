package com.prospring.gof.structural_patterns.proxy;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
