package com.prospring.gof.generating_patterns.abstractFactory;

import com.prospring.gof.generating_patterns.factory.Account;

public class BankFactory extends AbstractFactory{
    final String DEMIR_BANK = "DEMIR";
    final String BAKAI_BANK = "BAKAI";

    @Override
    public Bank getBank(String bankName) {
        if (DEMIR_BANK.equalsIgnoreCase(bankName)) {
            return new DemirBank();
        }
        else if(BAKAI_BANK.equalsIgnoreCase(bankName)) {
            return new BakaiBank();
        }
        return null;
    }

    @Override
    public Account getAccount(String accountType) {
        return null;
    }
}
