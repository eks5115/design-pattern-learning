package com.xrotor.design.pattern.struct.adapter;

/**
 *
 * @author eks5115
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concrete common");
    }
}
