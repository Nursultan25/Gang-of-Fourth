package com.prospring.gof.generating_patterns.prototype;

public class PrototypePatternMain {
    public static void main(String[] args) {
        Account currentAccount = (Account)
                AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();
    }
}
