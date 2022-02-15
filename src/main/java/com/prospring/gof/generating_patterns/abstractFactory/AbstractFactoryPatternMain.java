package com.prospring.gof.generating_patterns.abstractFactory;

import com.prospring.gof.generating_patterns.factory.Account;
import com.prospring.gof.generating_patterns.factory.AccountFactory;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("bank");
        Bank demirBank = abstractFactory.getBank("demir");
        demirBank.bankName();
    }
}
