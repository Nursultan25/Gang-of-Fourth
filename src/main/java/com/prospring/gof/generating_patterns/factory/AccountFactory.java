package com.prospring.gof.generating_patterns.factory;

import com.prospring.gof.generating_patterns.abstractFactory.AbstractFactory;
import com.prospring.gof.generating_patterns.abstractFactory.Bank;

public class AccountFactory extends AbstractFactory {
    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new CurrentAccount();
        }
        else if (SAVING_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
