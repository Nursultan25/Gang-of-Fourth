package com.prospring.gof.structural_patterns.adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        PaymentGetaway paymentGetaway = new PaymentGetawayImpl();
        AdvancedPayGetaway advancedPayGetaway = new AdvancedPaymentGetawayAdapter(paymentGetaway);
        String mobile1 = null;
        String mobile2 = null;
        advancedPayGetaway.makePayment(mobile1, mobile2);
    }
}
