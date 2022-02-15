package com.prospring.gof.structural_patterns.adapter;

import com.prospring.gof.generating_patterns.factory.Account;

public interface PaymentGetaway {
    void doPayment(Account account1, Account account2);
}
