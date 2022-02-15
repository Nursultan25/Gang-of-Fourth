package com.prospring.gof.generating_patterns.singleton;

public class SingletonClassLazy{
    private static SingletonClassLazy instance = null;
    private SingletonClassLazy(){}
    public static SingletonClassLazy getInstance() {
        if (instance == null) {
            instance =
                    new SingletonClassLazy();
        }
        return instance;
    }
}
