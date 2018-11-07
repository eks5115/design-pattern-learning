package com.xrotor.design.pattern.create.abstractfactory;

/**
 * @author eks5115
 */
public interface Factory {

    /**
     * create product a
     * @return
     */
    Product createProductA();

    /**
     * create product b
     * @return
     */
    Product createProductB();
}
