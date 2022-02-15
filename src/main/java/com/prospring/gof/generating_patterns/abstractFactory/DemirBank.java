package com.prospring.gof.generating_patterns.abstractFactory;

public class DemirBank implements Bank{
    @Override
    public void bankName() {
        System.out.println("Demir Bank!");
    }
}
