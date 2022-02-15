package com.prospring.gof.structural_patterns.facade;

import com.prospring.gof.structural_patterns.decorator.Account;
import com.prospring.gof.structural_patterns.decorator.SavingAccount;

public class AccountService {
    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}