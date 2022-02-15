package com.prospring.gof.generating_patterns.prototype;

public class CurrentAccount extends Account{
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT!");
    }
}
