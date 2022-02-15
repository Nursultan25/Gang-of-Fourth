package com.prospring.gof.generating_patterns.factory;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT!");
    }
}
