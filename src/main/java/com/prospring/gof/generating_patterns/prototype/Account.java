package com.prospring.gof.generating_patterns.prototype;

public abstract class Account implements Cloneable{
    abstract public void accountType();
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}
