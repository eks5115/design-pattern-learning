package com.xrotor.struct.bridge;

/**
 * @author eks5115
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB: operationImpl");
    }
}
