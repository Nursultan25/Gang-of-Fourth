package com.prospring.gof.structural_patterns.proxy;

public class ProxySavingAccount implements Account{
    Account savingAccount;
    @Override
    public void accountType() {
        if (savingAccount == null) {
            savingAccount = new SavingAccount();
        }
        savingAccount.accountType();
    }
}
