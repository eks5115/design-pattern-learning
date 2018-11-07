package com.xrotor.create.abstractfactory;

/**
 * @author eks5115
 */
public class Factory1 implements Factory {
    @Override
    public Product createProductA() {
        return new PaProduct("1-pa");
    }

    @Override
    public Product createProductB() {
        return new PbProduct("1-pb");
    }
}
