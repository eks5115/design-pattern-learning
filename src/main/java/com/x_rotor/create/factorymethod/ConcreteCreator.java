package com.x_rotor.create.factorymethod;

public class ConcreteCreator implements Creator {
    @Override
    public ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}