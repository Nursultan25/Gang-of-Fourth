package com.prospring.gof.structural_patterns.facade;

public class FacadePatternMain {
    public static void main(String[] args) {
        BankServiceFacade serviceFacade = new BankServiceFacadeImpl();
        serviceFacade.moneyTransfer();
    }
}
