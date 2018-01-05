package com.xrotor.action.observer;

/**
 *
 * @author eks5115
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("ConcreteObserver - ConcreteSubject's state is:" + subject.getState());
    }
}
