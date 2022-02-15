package com.prospring.gof.structural_patterns.facade;

import com.prospring.gof.structural_patterns.decorator.Account;

public class BankServiceFacadeImpl implements BankServiceFacade{
    @Override
    public void moneyTransfer() {
        if(PaymentService.doPayment()) {
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(1000, fromAccount, toAccount);
        }
    }
}
