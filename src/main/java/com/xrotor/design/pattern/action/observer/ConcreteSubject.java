package com.xrotor.design.pattern.action.observer;

/**
 *
 * @author eks5115
 */
public class ConcreteSubject implements Subject {

    private String state = "";

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}
