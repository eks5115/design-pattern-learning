package com.xrotor.create.factorymethod;

/**
 *
 * @author Chen_Sen
 * @date 2016/7/24
 */
public class FactoryMethodDemo {

    public static void main(String args[]) {
        Creator creator = new ConcreteCreator();
        ConcreteProduct concreteProduct = (ConcreteProduct) creator.factoryMethod();
    }
}