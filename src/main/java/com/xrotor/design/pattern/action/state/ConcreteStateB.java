package com.xrotor.design.pattern.action.state;

/**
 * @author eks5115
 */
public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteStateB: handle");
    }
}
