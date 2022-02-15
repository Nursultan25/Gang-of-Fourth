package com.prospring.gof.structural_patterns.composite;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
