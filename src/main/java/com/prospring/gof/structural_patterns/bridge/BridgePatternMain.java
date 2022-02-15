package com.prospring.gof.structural_patterns.bridge;

public class BridgePatternMain {
    public static void main(String[] args) {
        Bank demir = new DemirBank(new CurrentAccount());
        Account current = demir.openAccount();
        current.accountType();
    }
}
