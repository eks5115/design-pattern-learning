package com.xrotor.design.pattern.action.state;

/**
 * @author eks5115
 */
public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteStateA: handle");
    }
}
