package com.prospring.gof.structural_patterns.adapter;

import com.prospring.gof.generating_patterns.factory.Account;

public class PaymentGetawayImpl implements PaymentGetaway{
    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Getaway");
    }
}
