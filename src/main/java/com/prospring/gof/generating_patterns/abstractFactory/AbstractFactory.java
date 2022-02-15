package com.prospring.gof.generating_patterns.abstractFactory;

import com.prospring.gof.generating_patterns.factory.Account;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Account getAccount(String accountType);
}
