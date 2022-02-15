package com.prospring.gof.structural_patterns.decorator;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());

        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());
    }
}
