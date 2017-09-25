package com.x_rotor.create.factorymethod;

/**
 * Created by Chen_Sen on 2016/7/24.
 */
public class FactoryMethodDemo {

    public static void main(String args[]) {
        Creator creator = new ConcreteCreator();
        ConcreteProduct concreteProduct = (ConcreteProduct) creator.factoryMethod();
    }
}
