package com.prospring.gof.generating_patterns.abstractFactory;

public class BakaiBank implements Bank{
    @Override
    public void bankName() {
        System.out.println("Bakai Bank!");
    }
}
