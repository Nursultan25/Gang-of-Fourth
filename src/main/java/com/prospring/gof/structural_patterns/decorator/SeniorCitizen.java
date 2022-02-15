package com.prospring.gof.structural_patterns.decorator;

public class SeniorCitizen extends AccountDecorator{
    Account account;
    public SeniorCitizen(Account account) {
        super();
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are: " + applyOtherBenefits();
    }

    @Override
    String applyOtherBenefits() {
        return " an medical insurance of up to $1,000 for Senior Citizen";
    }
}
