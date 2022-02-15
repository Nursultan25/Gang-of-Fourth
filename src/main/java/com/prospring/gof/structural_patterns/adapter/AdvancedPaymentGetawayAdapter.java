package com.prospring.gof.structural_patterns.adapter;

import com.prospring.gof.generating_patterns.factory.Account;

public class AdvancedPaymentGetawayAdapter implements AdvancedPayGetaway{
    private PaymentGetaway paymentGetaway;
    public AdvancedPaymentGetawayAdapter(PaymentGetaway paymentGetaway) {
        this.paymentGetaway = paymentGetaway;
    }
    @Override
    public void makePayment(String mobile1, String mobile2) {
        Account account1 = null;
        Account account2 = null;
        paymentGetaway.doPayment(account1, account2);
    }
}
