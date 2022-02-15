package com.prospring.gof.structural_patterns.facade;

import com.prospring.gof.structural_patterns.decorator.Account;

public class TransferService {
    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering money");
    }
}
