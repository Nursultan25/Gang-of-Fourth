package com.prospring.gof.generating_patterns.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();
        Account savingAccount = factory.getAccount("SAVING");
        savingAccount.accountType();
    }
}
