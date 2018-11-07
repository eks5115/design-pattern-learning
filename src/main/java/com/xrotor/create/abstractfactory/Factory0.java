package com.xrotor.create.abstractfactory;

/**
 * @author eks5115
 */
public class Factory0 implements Factory {
    @Override
    public Product createProductA() {
        return new PaProduct("0-pa");
    }

    @Override
    public Product createProductB() {
        return new PbProduct("0-pb");
    }
}
