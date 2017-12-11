package com.xrotor.create.factorymethod;

/**
 * @author chensen
 */
public class ConcreteCreator implements Creator {
    @Override
    public ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}