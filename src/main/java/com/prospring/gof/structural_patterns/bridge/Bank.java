package com.prospring.gof.structural_patterns.bridge;

public abstract class Bank {
    public Account account;
    public Bank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}
