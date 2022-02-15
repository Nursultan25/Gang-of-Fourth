package com.prospring.gof.generating_patterns.singleton;

public class SingletonClassEarly {
    private static final SingletonClassEarly INSTANCE = new SingletonClassEarly();
    private SingletonClassEarly(){}
    public static SingletonClassEarly getInstance() {
        return INSTANCE;
    }
}
