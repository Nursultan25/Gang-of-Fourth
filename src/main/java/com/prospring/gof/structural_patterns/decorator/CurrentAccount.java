package com.prospring.gof.structural_patterns.decorator;

public class CurrentAccount implements Account{
    @Override
    public String getTotalBenefits() {
        return "There is no withdrawal limit for current account";
    }
}
